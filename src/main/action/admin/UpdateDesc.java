package main.action.admin;

import main.action.BaseAction;
import main.dao.DaoCollection;

public class UpdateDesc extends BaseAction {
    private int id;
    private String desc;

    public String execute() throws Exception{
        DaoCollection.getOrderDAO().updateDesc(desc,id);
            return "orderview";
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
