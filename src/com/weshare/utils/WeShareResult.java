package com.weshare.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * weshare自定义返回结果集
 */
public class WeShareResult {

    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static WeShareResult build(Integer status, String msg, Object data) {
        return new WeShareResult(status, msg, data);
    }

    public static WeShareResult ok(Object data) {
        return new WeShareResult(data);
    }

    public static WeShareResult ok() {
        return new WeShareResult(null);
    }

    public WeShareResult() {

    }

    public static WeShareResult build(Integer status, String msg) {
        return new WeShareResult(status, msg, null);
    }

    public WeShareResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public WeShareResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

//    public Boolean isOK() {
//        return this.status == 200;
//    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为TaotaoResult对象
     * 
     * @param jsonData json数据
     * @param clazz TaotaoResult中的object类型
     * @return
     */


    /**
     * 没有object对象的转化
     * 
     * @param json
     * @return
     */
    public static WeShareResult format(String json) {
        try {
            return MAPPER.readValue(json, WeShareResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
