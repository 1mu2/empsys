package com.lanqiao.empsys.dao;

import com.lanqiao.empsys.model.Users;


public interface UserMapper {

    /**
     * 登录
     * @param user
     * @return
     */
    Users selectForLogin(Users user);

}
