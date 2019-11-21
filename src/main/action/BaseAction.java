package main.action;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class BaseAction implements SessionAware, ServletRequestAware {
    protected Map<String,Object> session;
    protected HttpServletRequest request;

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request=request;

    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session=session;

    }
}
