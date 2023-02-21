package top.caoayu.livehelper.common.config.response;/*
 *
 * @version 2023/2/21 16:28
 * @author 14012
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResponseResult<T> {
    @Autowired
    private ResponseStatus responseStatus;
    private Long timestamp;
    private String status;
    private String message;
    private T data;

    public ResponseResult(Long timestamp, String status, String message, T data) {
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

//    public static <T> ResponseResult<T> success(){
//        return success(null);
//    }
//    public static <T> ResponseResult<T> success(T data){
//
//    }
}
