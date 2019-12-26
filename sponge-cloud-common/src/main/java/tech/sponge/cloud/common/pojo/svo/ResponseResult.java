package tech.sponge.cloud.common.pojo.svo;

import java.io.Serializable;

/**
 * 定义页面结果响应对象
 */
public class ResponseResult implements Serializable {
    private static final long serialVersionUID = 2303801211519275701L;

    private Integer code;
    private String messge;
    private Object data;

    public static ResponseResult success(){
        return success(200,null,null);
    }

    public static ResponseResult success(Integer code, String message, Object data){
        return new ResponseResult(code,message,data);
    }

    public static ResponseResult failure(){
        return failure(500,null,null);
    }

    public static ResponseResult failure(Integer code, String message, Object data){
        return new ResponseResult(code,message,data);
    }

    private ResponseResult() {}

    public ResponseResult(Integer code, String messge, Object data) {
        this.code = code;
        this.messge = messge;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "code=" + code +
                ", messge='" + messge + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessge() {
        return messge;
    }

    public void setMessge(String messge) {
        this.messge = messge;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
