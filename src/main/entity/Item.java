package main.entity;

public class Item extends Order{
/*    private int id;
    private int order_id;//订单id*/
    private int product_id;//产品id
    private String product_name;//产品名字
    private double discount_price;//折后价格
    private int product_num;//购买产品数量
    private double amount;//小计

/*    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }*/

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getDiscount_price() { return discount_price; }

    public void setDiscount_price(double discount_price) { this.discount_price = discount_price; }

    public int getProduct_num() {
        return product_num;
    }

    public void setProduct_num(int product_num) {
        this.product_num = product_num;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
