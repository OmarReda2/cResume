package com.myapp.cResume.controller;

import com.myapp.cResume.entity.User;
import com.myapp.cResume.service.UserService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

//    @PutMapping("/updateUser")
//    int UpdateUser(@RequestBody User user, @RequestParam("userId") Long userId){
//        return userService.updateUser(user, userId);
//    }


//    @PutMapping("/updateUser")
//    int UpdateUser(@RequestParam String userName, @RequestParam("userId") Long userId){
//        return userService.updateUser(userName, userId);
//    }
}
