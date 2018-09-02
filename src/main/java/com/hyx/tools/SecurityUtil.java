package com.hyx.tools;

import com.hyx.apps.login.bean.User;
import com.hyx.apps.map.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 安全相关工具类
 *
 * @author anke
 */
@Component
public class SecurityUtil {

    @Autowired
    private MapService mapService;

    /**
     * 从session获取userId信息
     *
     * @return
     */
    public static User getCurrentUser() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        User userBean = (User) request.getSession().getAttribute("userBean");
        return userBean;
    }

    /**
     * 从session获取list对象
     *
     * @param str
     * @return
     */
    public static Object getCurrentUser(String str) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Object attribute = request.getSession().getAttribute(str);
        return attribute;
    }
}
