package com.lanqiao.empsys.service;

import com.lanqiao.empsys.model.Users;


public interface IUserService {

    Users selectForLogin(Users user);

}
