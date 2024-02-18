package com.example.OnlineContactManagementSystem.services;
import com.example.OnlineContactManagementSystem.entity.UserTable;

public interface UserServices {

    UserTable saveUser(UserTable usertable);

    UserTable getUserById(Long userId);

    UserTable updateUser(Long userId, UserTable usertable);

    String deleteUserById(Long userId);

}

