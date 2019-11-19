package main.action.user;

import main.action.BaseAction;
import main.dao.DaoCollection;
import main.dao.UserDao;
import main.entity.User;

public class RegistAction extends BaseAction {
    private User user;

    public String execute() throws Exception{
        UserDao userDao = DaoCollection.getUserDao();
        userDao.save(user);
        System.out.println(1);
        session.put("s_user",user);
        System.out.println(2);

        return "success";
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
