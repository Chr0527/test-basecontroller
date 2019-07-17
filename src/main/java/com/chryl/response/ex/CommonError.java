package com.chryl.response.ex;

/**
 * Created By Chr on 2019/5/28.
 */

/**
 * 定义该接口，主要是为了可以自定义得到error的信息
 */
public interface CommonError {

    public String getErrorCode();
    public String getErrorMessage();
    public CommonError setErrorMessage(String errorMessage);

}
