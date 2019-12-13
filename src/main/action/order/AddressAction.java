package main.action.order;

import main.action.BaseAction;
import main.dao.DaoCollection;
import main.entity.ReceiveAddress;
import main.entity.User;

import java.util.ArrayList;
import java.util.List;

public class AddressAction extends BaseAction {
    List<ReceiveAddress> addrs = new ArrayList<ReceiveAddress>();

    public String execute() throws Exception{
        //从session中获取username
        String username = ((User)session.get("s_user")).getUsername();
        System.out.println(username);
        //从数据库中获取与username对应的地址
        addrs = DaoCollection.getReceiveAddressDAO().findByUserName(username);
        System.out.println(addrs);

        return "success";
    }

    public List<ReceiveAddress> getAddrs() {
        return addrs;
    }

    public void setAddrs(List<ReceiveAddress> addrs) {
        this.addrs = addrs;
    }
}
