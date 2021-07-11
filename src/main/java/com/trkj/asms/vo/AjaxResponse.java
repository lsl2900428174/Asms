package com.trkj.asms.vo;

<<<<<<< HEAD
=======

>>>>>>> 6a75340af3fcb8de092b42fe5383ae29db6b200e
import com.trkj.asms.exception.CustomError;
import com.trkj.asms.exception.CustomErrorType;
import lombok.Data;


@Data
public class AjaxResponse {


    private boolean isSuccess;
    private int code;   
    private String message;
    private Object data;

    private AjaxResponse() {

    }

    /**
     * 请求出现异常时的响应数据封装
     * @param e:异常
     * @return AjaxResponse 封闭后的响应对象
     */
    public static AjaxResponse error(CustomError e) {

        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setSuccess(false);
        resultBean.setCode(e.getCode());
        if(e.getCode() == CustomErrorType.USER_INPUT_ERROR.getCode()){
            resultBean.setMessage(e.getMessage());
        }else if(e.getCode() == CustomErrorType.SYSTEM_ERROR.getCode()){
            resultBean.setMessage(e.getMessage() + ",系统出现异常，请联系管理员!");
<<<<<<< HEAD
=======
        }else if(e.getCode()== CustomErrorType.PAGE_NOT_FOUND_ERROR.getCode()){
            resultBean.setMessage("未能找到所请求的资源！");
        }else if(e.getCode()== CustomErrorType.ACCOUNT_ERROR.getCode()){
            resultBean.setMessage(e.getMessage());
>>>>>>> 6a75340af3fcb8de092b42fe5383ae29db6b200e
        }else{
            resultBean.setMessage("系统出现未知异常，请联系管理员电话!");
        }
        return resultBean;
    }
    /**
     * 请求正常的响应时进行数据封装
     * @return AjaxResponse 封闭后的响应对象
     */
    public static AjaxResponse success() {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setSuccess(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        return resultBean;
    }
    /**
     * 请求正常的响应时进行数据封装
     * @param data:要封装到响应对象的数据
     * @return AjaxResponse 封闭后的响应对象
     */
    public static AjaxResponse success(Object data) {
<<<<<<< HEAD
        AjaxResponse resultBean = new AjaxResponse();
=======
       AjaxResponse resultBean = new AjaxResponse();
>>>>>>> 6a75340af3fcb8de092b42fe5383ae29db6b200e
        resultBean.setSuccess(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        resultBean.setData(data);
        return resultBean;
    }


}