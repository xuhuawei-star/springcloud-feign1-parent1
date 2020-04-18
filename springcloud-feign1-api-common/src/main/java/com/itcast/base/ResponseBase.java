package com.itcast.base;

/**
 * @author XHW
 * @date 2020/4/17 - 18:54
 */
public class ResponseBase {

    private Integer rtncode;
    private String msg;
    private Object data;
    public ResponseBase(Integer rtncode, String msg, Object data) {
        super();
        this.rtncode = rtncode;
        this.msg = msg;
        this.data = data;
    }
    public ResponseBase() {
        super();

    }
    @Override
    public String toString() {
        return "ResponseBase [rtncode=" + rtncode + ", msg=" + msg + ", data=" + data + "]";
    }
    public Integer getRtncode() {
        return rtncode;
    }
    public void setRtncode(Integer rtncode) {
        this.rtncode = rtncode;
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

}
