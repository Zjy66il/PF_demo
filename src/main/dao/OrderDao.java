package main.dao;

import main.action.cart.CartService;
import main.entity.Item;
import main.entity.Order;

import java.util.List;

public interface OrderDao {
    public void save(Order order, CartService cart) throws Exception;

    public List<Item> findOrderInfo(String username) throws Exception;

    public List<Order> findUnconfirmOrderInfo() throws Exception;

    public List<Order> findConfirmOrderInfo() throws Exception;

    public void deliverOrder(int id) throws Exception;

    public void updateDesc(String desc,int id) throws Exception;

}
