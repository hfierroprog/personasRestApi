package cl.hfierroprog.personas.rest.api.entity;

import java.io.Serializable;

public class DefaultResponse implements Serializable {
    private Integer code;
    private String message;
    private Object responseObject;

    public DefaultResponse() {
    }

    public DefaultResponse(Integer code, String message, Object responseObject) {
        this.code = code;
        this.message = message;
        this.responseObject = responseObject;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(Object responseObject) {
        this.responseObject = responseObject;
    }

    @Override
    public String toString() {
        return "DefaultResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", responseObject=" + responseObject +
                '}';
    }
}
