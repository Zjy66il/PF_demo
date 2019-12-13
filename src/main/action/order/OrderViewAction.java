package main.action.order;

import main.action.BaseAction;
import main.dao.DaoCollection;
import main.entity.Item;
import main.entity.User;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class OrderViewAction extends BaseAction {
    private List<Item> items=new ArrayList<Item>();

    public String execute() throws Exception{
        //从session中获取username
        String username = ((User)session.get("s_user")).getUsername();
        //通过dao获得订单信息
        System.out.println(username);
        items = DaoCollection.getOrderDAO().findOrderInfo(username);

        System.out.println(items);

        return "orderview";
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
