package main.action.cart;

import com.opensymphony.xwork2.ActionContext;
import main.dao.DaoCollection;
import main.dao.ProductDao;

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
            ci.setP(pDao.findById(id));
            store.put(id, ci);
        }

    }

    @Override
    public void update(int id, int num) throws Exception {

    }

    @Override
    public void delete(int id) throws Exception {

    }

    @Override
    public void clearCart() throws Exception {

    }

    @Override
    public double total(boolean flag) throws Exception {
        return 0;
    }

    @Override
    public List<CartItem> getItems(boolean delete) throws Exception {
        return null;
    }
}
