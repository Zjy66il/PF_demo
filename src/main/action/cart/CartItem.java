package main.action.cart;

import main.entity.Product;

public class CartItem {
    private Product pro;
    private int num = 1;

    public Product getPro() {
        return pro;
    }

    public void setPro(Product pro) {
        this.pro = pro;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
