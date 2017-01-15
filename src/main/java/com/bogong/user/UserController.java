package com.bogong.user;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class UserController {

    @RequestMapping("/user/{name}")
    @ResponseBody
    User getUser(@PathVariable String name) {
        return new User(name);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserController.class, args);
    }
}