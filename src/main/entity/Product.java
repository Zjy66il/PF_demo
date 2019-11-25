package main.entity;

public class Product {
    /**
    商品属性
     */

    private int id;
    private String book_name;		//名字
    private String description;			//描述
    private long add_time;				//添加时间
    private double fixed_price;			//原价
    private double discount_price;			//打折后
    private int has_deleted;			//是否下架
    private String book_pic;			//图片

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getAdd_time() {
        return add_time;
    }

    public void setAdd_time(long add_time) {
        this.add_time = add_time;
    }

    public double getFixed_price() {
        return fixed_price;
    }

    public void setFixed_price(double fixed_price) {
        this.fixed_price = fixed_price;
    }

    public double getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(double discount_price) {
        this.discount_price = discount_price;
    }

    public int getHas_deleted() {
        return has_deleted;
    }

    public void setHas_deleted(int has_deleted) {
        this.has_deleted = has_deleted;
    }

    public String getBook_pic() {
        return book_pic;
    }

    public void setBook_pic(String book_pic) {
        this.book_pic = book_pic;
    }
}
