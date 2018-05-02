package com.ssm.commons.exception.vo;

/**
 * @Author: chen
 * @Date: Created in 0:03 2018/4/26
 */
public class AppResultVO {

    private Object data;

    private int isSuccess;

    private int msg;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(int isSuccess) {
        this.isSuccess = isSuccess;
    }

    public int getMsg() {
        return msg;
    }

    public void setMsg(int msg) {
        this.msg = msg;
    }
}
