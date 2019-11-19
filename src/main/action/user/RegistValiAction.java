package main.action.user;

import main.action.BaseAction;
import main.dao.DaoCollection;
import main.dao.UserDao;
import main.entity.User;
import org.apache.struts2.json.annotations.JSON;

public class RegistValiAction extends BaseAction {
    private User user;
    private boolean flag;

    //检测用户名是否已经被注册
    public String valiName() throws Exception{
        UserDao dao = DaoCollection.getUserDao();
        User u = dao.findByName(user.getUsername());

        if(u!=null){
            flag = false;
        }else {
            flag = true;
        }
        return "success";
    }

    @JSON(serialize = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
