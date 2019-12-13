package main.action.order;

import main.action.BaseAction;
import main.action.CartRefAction;
import main.action.cart.CartFactory;
import main.action.cart.CartService;
import main.dao.DaoCollection;
import main.dao.ReceiveAddressDao;
import main.entity.Item;
import main.entity.Order;
import main.entity.ReceiveAddress;
import main.entity.User;

public class OrderSubmitAction extends CartRefAction {
    private ReceiveAddress addr;
    private Order order;

    public String execute() throws Exception{
        //获取购物车
        CartService cart = getCart();
        //如果购物车中无商品，返回/main/main.jsp
        if(cart.getItems().size()==0){
            return "empty";
        }
        //获得username
        String username = ((User)session.get("s_user")).getUsername();
        //username赋给addr实例
        addr.setUsername(username);
        //创建order实例并对其赋值
        order = new Order();
        order.setFull_address(addr.getFull_address());
        order.setUsername(username);
        order.setMobile(addr.getMobile());
        order.setOrder_desc("Waiting Process");
        order.setOrder_time(System.currentTimeMillis());
        order.setPostal_code(addr.getPostal_code());
        order.setReceive_name(addr.getReceive_name());
        order.setStatus(0);
        order.setTotal_price(cart.total());

        //通过dao将数据存入数据库中
        //保存地址信息到数据库
/*        ReceiveAddressDao rDao = DaoCollection.getReceiveAddressDAO();
        if(rDao.findById(addr.getId()) == null){
            rDao.save(addr);
        }*/

        System.out.println("保存地址信息到数据库（已注释）");

        //保存订单信息到数据库
        DaoCollection.getOrderDAO().save(order, cart);

        System.out.println("保存订单信息");
        //清空购物车信息
        CartFactory.removeCart(CartFactory.SESSION_TYPE);

        System.out.println("数据库操作完成");

        return "success";
    }

    public ReceiveAddress getAddr() {
        return addr;
    }

    public void setAddr(ReceiveAddress addr) {
        this.addr = addr;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
