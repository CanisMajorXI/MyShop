package com.jzm.dao.user;

import com.jzm.model.User;
import com.jzm.model.UserInformation;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUserByEmail(String email);

//    User getUserById(Integer id);
//
    void addAnUser(User user);

    void addAnUserInfo(UserInformation userInfo);
//
//    void removeAnUser(User user);

}
