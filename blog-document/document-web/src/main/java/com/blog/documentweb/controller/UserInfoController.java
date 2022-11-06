package com.blog.documentweb.controller;

import com.blog.document.service.UserInfoImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RequestMapping("user")
@RestController
@ResponseBody
@Slf4j
public class UserInfoController {
    @Autowired
    private UserInfoImpl userInfoImpl;
    @GetMapping("/all")
    public List<String> getAll(){
        log.info("----user/all");
        return userInfoImpl.getAll();
    }
    @PostConstruct
    public  void construct(){
        System.out.println("user---<<");
    }
}
