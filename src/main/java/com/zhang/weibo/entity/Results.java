package com.zhang.weibo.entity;

public class Results {
    Integer StateCode;
    Boolean Result;
    String Message;
    Object Data;

    public Results() {
    }

    public Results(Object data){
        StateCode = 200;
        Result = true;
        Message = "Success";
        Data = data;
    }

    public Results(Integer stateCode,String message){
        StateCode = stateCode;
        Result = false;
        Message = message;
        Data = null;
    }

    public Integer getStateCode() {
        return StateCode;
    }

    public void setStateCode(Integer stateCode) {
        StateCode = stateCode;
    }

    public Boolean getResult() {
        return Result;
    }

    public void setResult(Boolean result) {
        Result = result;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "Results{" +
                "StateCode=" + StateCode +
                ", Result=" + Result +
                ", Message='" + Message + '\'' +
                ", Data=" + Data.toString() +
                '}';
    }
}
