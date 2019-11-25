package main.action.user;

import main.action.BaseAction;

public class LogoutAction extends BaseAction {
    public String execute(){
        session.clear();
        return "success";
    }
}
