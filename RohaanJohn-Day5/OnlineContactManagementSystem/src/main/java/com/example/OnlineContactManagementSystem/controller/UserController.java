package com.example.OnlineContactManagementSystem.controller;
import com.example.OnlineContactManagementSystem.entity.UserTable;
import com.example.OnlineContactManagementSystem.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserServices userService;

    @PostMapping("/api/v1/users")
    public UserTable saveUser(@RequestBody UserTable usertable){
        return userService.saveUser(usertable);
    }

    @GetMapping("/api/v1/users/{id}")
    public UserTable getUserById(@PathVariable("id") Long userId){
    return userService.getUserById(userId);
    }

    @PutMapping("/api/v1/users/{id}")
    public UserTable updateUser(@PathVariable("id") Long userId, @RequestBody UserTable usertable ){
        return userService.updateUser(userId, usertable);
    }

    @DeleteMapping("/api/v1/users/{id}")
    public void deleteUserById(@PathVariable("id") Long userId) {
        userService.deleteUserById(userId);
    }

}
