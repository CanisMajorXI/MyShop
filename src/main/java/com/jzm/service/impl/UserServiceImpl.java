package com.jzm.service.impl;

import com.jzm.dao.user.UserMapper;
import com.jzm.model.User;
import com.jzm.model.UserInformation;
import com.jzm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper = null;

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    @Override
    public User login(String email, String password) {
        return userMapper.getUserByEmail(email);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    @Override
    public boolean isNotDuplicate(String email) {
        return userMapper.getUserByEmail(email) == null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
    @Override
    public void register(String email, String password) {
        User tempUser = new User();
        tempUser.setEmail(email);
        tempUser.setPassword(password);
        tempUser.setType(User.TYPE_ORDINARY);
        userMapper.addAnUser(tempUser);
        Integer id = tempUser.getId();
        UserInformation userInformation = new UserInformation();
        userInformation.setUserId(id);
        userMapper.addAnUserInfo(userInformation);
    }


}
