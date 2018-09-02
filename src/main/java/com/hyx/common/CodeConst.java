package com.hyx.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 响应编码常量
 *
 * @author czy
 * @date 2016年9月19日16:27:33
 */
public class CodeConst {
    /**
     * 成功
     */
    public static final String CODE_OK = "1000";

    /**成功，但是无数据
     *
     */
    public static final String CODE_OK_NO_DATA = "1001";

    /**
     * 处理失败
     */
    public static final String CODE_ERROR = "2000";
    /**
     * 传入参数错误
     */
    public static final String CODE_ERROR_PARAMETER = "2001";
    /**
     * 上送参数不能为空
     */
    public static final String CODE_ERROR_PARAMETER_EMPTY = "2002";

    /**
     * 服务执行失败
     */
    public static final String CODE_FAIL = "3000";
    /**
     * 登陆失败
     */
    public static final String CODE_FAIL_LOGIN = "3101";
    /**
     * 登陆失败[用户名或密码错误]
     */
    public static final String CODE_FAIL_LOGIN_ID_PWD = "3102";
    public static final String CODE_FAIL_DATA_EMPTY = "3103";
    /**
     * 密码错误
     */
    public static final String CODE_FAIL_PASS = "3004";
    /**
     * 未登录，请先进行登录操作
     */
    public static final String CODE_FAIL_NO_LOGIN = "3104";

    /**
     * 没有这个用户或客户
     */
    public static final String CODE_NO_USER_OR_CUSTOMER = "4001";
    /***
     * 您没有上送正确的token
     */
    public static final String CODE_TOKEN_ERROR = "4002";
    /**
     * 您上送的token已超时，请重新获取
     */
    public static final String CODE_TOKEN_EXPIRES = "4003";
    /**
     * 已经存在该用户
     */
    public static final String CODE_HAD_USER_OR_CUSTOMER = "4004";

    /**
     * 未知
     */
    public static final String CODE_UNKNOWN = "9999";
    /**
     * 数据正在更新，暂不提供访问数据权限
     */
    public static final String CODE_INFO_UNCON = "5555";

    public static Map<String, String> msgMap = new HashMap<String, String>() {
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        {
            this.put(CODE_ERROR, "处理失败");
            this.put(CODE_ERROR_PARAMETER, "传入参数错误");
            this.put(CODE_ERROR_PARAMETER_EMPTY, "上送参数不能为空");
            this.put(CODE_FAIL, "服务执行失败");
            this.put(CODE_FAIL_LOGIN, "登陆失败");
            this.put(CODE_FAIL_LOGIN_ID_PWD, "登陆失败[用户名或密码错误]");
            this.put(CODE_FAIL_NO_LOGIN, "未登录，请先进行登录操作");
            this.put(CODE_INFO_UNCON, "数据正在更新，暂不提供访问数据权限");
            this.put(CODE_NO_USER_OR_CUSTOMER, "没有这个用户或客户");
            this.put(CODE_HAD_USER_OR_CUSTOMER, "已经存在该用户");
            this.put(CODE_FAIL_PASS, "密码错误");
            this.put(CODE_TOKEN_ERROR, "您没有上送正确的token");
            this.put(CODE_TOKEN_EXPIRES, "您上送的token已超时，请重新获取");
            this.put(CODE_OK, "成功");
            this.put(CODE_OK_NO_DATA, "成功，但是无数据");
        }
    };

    /**
     * 获取编码描述信息
     *
     * @param code
     * @return
     */
    public static String getCodeMessage(String code) {
        return msgMap.get(code);
    }
}
