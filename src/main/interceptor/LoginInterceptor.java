package main.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

public class LoginInterceptor extends AbstractInterceptor {
    /**
     * 检查用户是否登录的拦截器
     */
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        //获取session
        Map<String,Object> session = actionInvocation.getInvocationContext().getSession();
        if(session.get("s_user") == null){
            return "login";
        }
        return actionInvocation.invoke();
    }
}
