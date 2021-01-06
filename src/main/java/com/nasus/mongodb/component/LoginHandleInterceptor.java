package com.nasus.mongodb.component;

import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Royal on 2020/7/29
 */
public class LoginHandleInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        return true;

//        String  loginFlag = (String)request.getSession().getAttribute("sessionid");
//        if(StringUtils.isEmpty(loginFlag)){// 未登录
//            request.setAttribute("msg","没有登录，请登录！");
//            request.getRequestDispatcher("/index.html").forward(request,response);
//            return  false;
//        }else{
//            return true;
//        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
