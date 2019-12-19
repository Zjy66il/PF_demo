package main.action.admin;

import main.action.BaseAction;
import main.dao.DaoCollection;
import main.entity.Item;
import main.entity.Order;
import main.entity.User;

import java.util.ArrayList;
import java.util.List;

public class OrderConfirm extends BaseAction {
    private List<Order> unconfirmitems=new ArrayList<Order>();
    private List<Order> confirmitems=new ArrayList<Order>();

    public String execute() throws Exception{
        //从session中获取username

        //通过dao获得订单信息
        unconfirmitems = DaoCollection.getOrderDAO().findUnconfirmOrderInfo();
        confirmitems = DaoCollection.getOrderDAO().findConfirmOrderInfo();


        return "orderview";
    }

    public List<Order> getUnconfirmitems() {
        return unconfirmitems;
    }

    public void setUnconfirmitems(List<Order> unconfirmitems) {
        this.unconfirmitems = unconfirmitems;
    }

    public List<Order> getConfirmitems() {
        return confirmitems;
    }

    public void setConfirmitems(List<Order> confirmitems) {
        this.confirmitems = confirmitems;
    }
}
