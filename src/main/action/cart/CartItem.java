package main.action.cart;

import main.entity.Product;

public class CartItem {
    private Product p;
    private int num=1;
    private boolean delete=false; //删除还是购买

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }
}
