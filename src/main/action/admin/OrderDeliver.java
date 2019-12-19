package main.action.admin;

import main.action.BaseAction;
import main.dao.DaoCollection;

public class OrderDeliver extends BaseAction {
        private int id;

        public String execute() throws Exception{
            DaoCollection.getOrderDAO().deliverOrder(id);
            return "orderview";
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
