package com.hj.exception_advice;
//异常处理类
public class BusinessException extends RuntimeException {
    private Integer code;
    private String message;
        public BusinessException(Integer code,String message){
            this.code = code;
            this.message = message;
        }
        public Integer getCode() {
            return code;
        }
        public void setCode(Integer code){
            this.code = code;
        }
        @Override
        public String getMessage(){
            return message;
        }
        public void setMessage(String message){
            this.message = message;
        }
}
