package com.hyx.common;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author anke
 * @date 2018/5/17
 */
public class ContentData {
    @ApiModelProperty(value = "内容主体")
    private Object content;
    @ApiModelProperty(value = "总条数")
    private int total;


    public ContentData() {
    }

    ContentData(Object content, int total) {
        this.content = content;
        this.total = total;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ContentData{" +
                "content=" + content +
                ", total=" + total +
                '}';
    }
}
