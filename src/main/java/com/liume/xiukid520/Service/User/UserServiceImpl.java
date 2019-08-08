package com.liume.xiukid520.Service.User;

import com.liume.xiukid520.Entity.User;
import com.liume.xiukid520.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean userAuth(User user) {
        boolean flag = false;
        System.out.println(userRepository.findUserByUserNameAndPassword(user.getUserName(), user.getPassword()));
        if (userRepository.findUserByUserNameAndPassword(user.getUserName(), user.getPassword()) != null)
            flag = true;
        return flag;
    }
}
