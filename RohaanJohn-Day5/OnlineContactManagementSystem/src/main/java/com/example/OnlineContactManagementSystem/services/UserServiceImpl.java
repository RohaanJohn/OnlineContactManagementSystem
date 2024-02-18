package com.example.OnlineContactManagementSystem.services;
import com.example.OnlineContactManagementSystem.entity.UserTable;
import com.example.OnlineContactManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service

public class UserServiceImpl implements UserServices {

    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserTable saveUser(UserTable usertable) {
        logger.info("\n\n\nLog: User Details Saved!\n\n\n");
        return userRepository.save(usertable);
    }

    @Override
    public UserTable getUserById(Long userId) {
        logger.info("\n\n\nLog: User Details Displayed!\n\n\n");
        return userRepository.findById(userId).get();
    }

    @Override
    public UserTable updateUser(Long userId, UserTable usertable) {

        UserTable usertableDB = userRepository.findById(userId).get();

        if (Objects.nonNull(usertable.getUserName()) && !"".equalsIgnoreCase(usertable.getUserName())) {
            usertableDB.setUserName(usertable.getUserName());
        }

        if (Objects.nonNull(usertable.getUserPhoneNumber()) && !"".equalsIgnoreCase(usertable.getUserPhoneNumber())) {
            usertableDB.setUserPhoneNumber(usertable.getUserPhoneNumber());
        }

        if (Objects.nonNull(usertable.getUserEmailAddress()) && !"".equalsIgnoreCase(usertable.getUserEmailAddress())) {
            usertableDB.setUserEmailAddress(usertable.getUserEmailAddress());
        }

        logger.info("\n\n\nLog: User Details Updated!\n\n\n");
        return userRepository.save(usertableDB);
    }

    @Override
    public String deleteUserById(Long userId) {
        userRepository.deleteById(userId);
        logger.info("\n\n\nLog: User Details Deleted!\n\n\n");
        return("Success");
    }
}