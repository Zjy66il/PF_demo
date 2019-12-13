package main.action;

import main.action.cart.CartFactory;
import main.action.cart.CartService;

public class CartRefAction extends BaseAction{
        protected CartService getCart(){
            return CartFactory.getCart(CartFactory.SESSION_TYPE);
        }
}
