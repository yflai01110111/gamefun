package com.pizidea.framework.services;

import com.pizidea.framework.beans.UserBean;

import retrofit.http.POST;
import retrofit.http.Path;

/**
 * <b>用户标签接口</b><br/>
 * Created by yflai on 2015/5/31.
 */
public interface UserTagService {

    @POST("/user/{uid}")
    UserBean getUserInfo(@Path("uid") int userId);

    @POST("/user/{uid}")
    boolean modifyUserInfo(@Path("uid") int userId);


}
