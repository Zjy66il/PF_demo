package main.action.order;

import main.action.CartRefAction;
import main.action.cart.CartItem;

import java.util.List;

public class OrderConfirmAction extends CartRefAction {
    private List<CartItem> items;//购物车中的商品信息(CartItem)表

    public String execute() throws Exception{
        items = getCart().getItems();
        //如果购物车中商品为空，返回商品界面
        if(items.size()==0){
            return "empty";
        }
        return "success";
    }

    //获取商品总金额
    public double getTotalPrice() throws Exception{
        return getCart().total();
    }
    public List<CartItem> getItems() {
        return items;
    }
    public void setItems(List<CartItem> items) {
        this.items = items;
    }
}
