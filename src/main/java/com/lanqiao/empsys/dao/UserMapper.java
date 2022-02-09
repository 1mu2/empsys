package com.lanqiao.empsys.dao;

import com.lanqiao.empsys.model.Users;

/**
 * @author 张建平
 * @createtime 2022/2/6 下午5:50
 */
public interface UserMapper {

    /**
     * 登录
     * @param user
     * @return
     */
    Users selectForLogin(Users user);

}
