package com.hyx.common;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 统一响应数据结构
 *
 * @author anke
 * @date 2018/5/14
 */
@ApiModel
public class ResponseBean {
    @ApiModelProperty(required = true, value = "状态码")
    private int code = Integer.parseInt(CodeConst.CODE_OK);
    @ApiModelProperty(value = "文本消息,用于解释状态码或其他说明信息")
    private String message = "成功";
    @ApiModelProperty(value = "内容主体")
    private Object data;

    public ResponseBean() {
    }

    /**
     * 直接返回数据内容
     *
     * @param data
     */
    public ResponseBean(Object data) {
        this.data = data;
    }

    /**
     * 用于返回错误，返回错误码及错误提示
     *
     * @param code
     * @param message
     */
    public ResponseBean(String code, String message) {
        this.code = Integer.parseInt(code);
        this.message = message;
    }

    /**
     * 封装了一下，返回数据内容，及数据条数
     *
     * @param content
     * @param total
     */
    public ResponseBean(Object content, int total) {
        this.data = new ContentData(content, total);
    }


    public int getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = Integer.parseInt(code);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
