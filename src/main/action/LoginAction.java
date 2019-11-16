package main.action;

import main.dao.DaoCollection;
import main.dao.UserDao;
import main.entity.User;


public class LoginAction {
    private User user;
    public String execute() throws Exception{

        //验证用户名和密码是否正确，不正确返回login_from.jsp
        UserDao dao = DaoCollection.getUserDao();
        User u = dao.findByName(user.getUsername());

        if(u==null || !u.getPassword().equals(user.getPassword())){
            //用户名或密码错误
            return "fail";

        }
        //登录成功
        return "success";

    }

    public User getUser() {

        return user;
    }
    public void setUser(User user){
        this.user = user;
    }


}

