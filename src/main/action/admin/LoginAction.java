package main.action.admin;

import main.action.BaseAction;
import main.dao.AdminDao;
import main.dao.DaoCollection;
import main.entity.Admin;

public class LoginAction extends BaseAction {
    private Admin admin;
    public String execute() throws Exception{

        //验证用户名和密码是否正确，不正确返回login_from.jsp
        AdminDao dao = DaoCollection.getAdminDAO();
        Admin u = dao.findByName(admin.getRoot());

        if(u==null || !u.getPassword().equals(admin.getPassword())){
            //用户名或密码错误
            return "fail";

        }
        //登录成功
        session.put("s_admin", u);
        return "success";

    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
