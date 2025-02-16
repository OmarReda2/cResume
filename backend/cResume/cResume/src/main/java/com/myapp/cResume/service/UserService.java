package com.myapp.cResume.service;

import com.myapp.cResume.dao.UserRepository;
import com.myapp.cResume.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

//    @Transactional
//    public int updateUser(User user, Long id){
//        return userRepository.updateUser(user, id);
//    }

//    @Transactional
//    public User updateUser(String userName, Long id){
//        return userRepository.updateUser(userName, id);
//    }
}
