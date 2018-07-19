package com.jzm.service;


import com.jzm.model.User;

public interface UserService {

    User login(String email, String password);

    boolean isNotDuplicate(String email);

    void register(String email, String password);

}
