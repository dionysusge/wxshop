package com.javaclimb.config;

import com.javaclimb.common.Common;
import com.javaclimb.entity.UserInfo;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 全局拦截器
 * 如果没有登录，就重定向到登陆页面
*/

public class MyInterceptor implements HandlerInterceptor {
/**
     * 所有访问后台的请求要先从这里路过
     * 返回true就继续处理后面的请求，返回false就中断，直接转向登录页
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception*/

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        System.out.println("拦截路径：" + uri); // 查看控制台输出
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute(Common.USER_INFO);
        if (userInfo == null) {
            response.sendRedirect("/end/page/login.html");
            return false;
        }
        return true;
    }
}
