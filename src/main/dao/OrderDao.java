package main.dao;

import main.action.cart.CartService;
import main.entity.Item;
import main.entity.Order;

import java.util.List;

public interface OrderDao {
    public void save(Order order, CartService cart) throws Exception;

    public List<Item> findOrderInfo(String username) throws Exception;
}
