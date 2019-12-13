package main.action.cart;

import com.opensymphony.xwork2.ActionContext;
import main.dao.DaoCollection;
import main.dao.ProductDao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SessionCartServiceImpl implements CartService{
    private Map<Integer,CartItem> store = new HashMap<Integer,CartItem>();

    public SessionCartServiceImpl(){
        //如果session中已存在购物车，则恢复store
        Map<String,Object> session = ActionContext.getContext().getSession();
        SessionCartServiceImpl cart = (SessionCartServiceImpl) session.get("s_cart");
        if(cart != null){
            this.store = cart.store;
        }
    }

    @Override
    public void buy(int id) throws Exception {
        if(store.containsKey(id)){
            //如果购物车中已存在，产品数量+1
            CartItem ci = store.get(id);
            ci.setNum(ci.getNum()+1);
        }else{
            //如果不存在，则从数据库中找出相应商品，添加进购物车
            CartItem ci = new CartItem();
            ProductDao pDao = DaoCollection.getProductDAO();
            ci.setPro(pDao.findById(id));
            store.put(id, ci);
        }

    }

    @Override
    /**
     * 根据id更新产品数量
     */
    public void update(int id, int num) throws Exception {
        if(store.containsKey(id)){
            store.get(id).setNum(num);
        }
    }

    /**
     * 删除购物车中的物品
     */
    @Override
    public void delete(int id) throws Exception {
        if(store.containsKey(id)){
            store.remove(id);
        }

    }

    /**
     * 清空购物车
     */
    @Override
    public void clearCart() throws Exception {
        CartFactory.removeCart(CartFactory.SESSION_TYPE);
    }

    /**
     * 统计购物车总价格
     */
    @Override
    public double total() throws Exception {
        double totalPrice = 0.0;
        for(CartItem ci : getItems()){
            totalPrice += ci.getNum() * ci.getPro().getDiscount_price();
        }
        totalPrice = Number2(totalPrice);

        return totalPrice;
    }

    @Override
    public List<CartItem> getItems() {
        List<CartItem> cis = new ArrayList<CartItem>();
        for(CartItem ci : store.values()){
                cis.add(ci);
        }
        return cis;
    }

    public Map<Integer, CartItem> getStore() {
        return store;
    }

    /**
     * 将double型数字保留两位小数
     * @param pDouble
     * @return
     */
    private double Number2(double pDouble) {
        BigDecimal bd = new BigDecimal(pDouble);
        //保留2位小数并四舍五入
        BigDecimal bd1 = bd.setScale(2, bd.ROUND_HALF_UP);
        pDouble = bd1.doubleValue();

        return pDouble;
    }
}
