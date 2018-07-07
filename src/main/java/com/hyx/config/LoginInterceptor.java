package com.hyx.config;

import com.hyx.common.CodeConst;
import com.hyx.common.ResponseBean;
import com.hyx.tools.JsonKit;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 登录拦截器
 *
 * @author anke
 * @date 2018/5/21
 */
public class LoginInterceptor implements HandlerInterceptor {
    private final static String SESSION_KEY = "userId";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        System.out.println(request.getRequestURI());
        //获取session
        HttpSession session = request.getSession();
        if (session.getAttribute(SESSION_KEY) == null) {
            ResponseBean responseBean = new ResponseBean(CodeConst.CODE_FAIL_NO_LOGIN, CodeConst.msgMap.get(CodeConst.CODE_FAIL_NO_LOGIN));
            response.reset(); // 非常重要
            response.setContentType("application/json;charset=UTF-8");
            OutputStream outputStream = response.getOutputStream();
            outputStream.write(JsonKit.toJson(responseBean).getBytes("UTF-8"));
            outputStream.close();
            return false;
        } else {
            session.setAttribute(SESSION_KEY, session.getAttribute(SESSION_KEY));
            return true;
        }
    }


    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
