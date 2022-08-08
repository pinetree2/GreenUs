package com.example.greenus;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@RequestMapping("/user")
@RestController
public class UserController {
    @GetMapping("/test")
    public User UserTest(){
        //new Date 이거 현재날짜로 들어감..
        return new User("test","1234","test@naver.com",new Date());
    }

    @GetMapping("/test2")
    public ArrayList<User> UserTest2(){
        return new ArrayList<>(Arrays.asList(
                new User("test","1234","test@naver.com",new Date()),
                new User("test2","1234","test2@naver.com",new Date()),
                new User("test3","1234","test3@naver.com",new Date())

        ));
    }
}
