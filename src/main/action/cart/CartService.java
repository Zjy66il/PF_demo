package main.action.cart;

import java.util.List;

public interface CartService {
    public void buy(int id) throws Exception;
    public void update(int id,int num) throws Exception;
    public void delete(int id) throws Exception;
    public void clearCart() throws Exception;

    public double total() throws Exception;
    public List<CartItem> getItems() throws Exception;//返回产品集合
}
