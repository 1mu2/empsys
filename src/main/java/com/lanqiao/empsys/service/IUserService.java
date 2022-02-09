package com.lanqiao.empsys.service;

import com.lanqiao.empsys.model.Users;

/**
 * @author 张建平
 * @createtime 2022/2/6 下午5:50
 */
public interface IUserService {

    Users selectForLogin(Users user);

}
