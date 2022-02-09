package com.lanqiao.empsys.service.impl;

import com.lanqiao.empsys.dao.UserMapper;
import com.lanqiao.empsys.model.Users;
import com.lanqiao.empsys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张建平
 * @createtime 2022/2/6 下午5:56
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Users selectForLogin(Users user) {
        return this.userMapper.selectForLogin(user);
    }

}
