package com.blog.document.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("doc")
@ResponseBody
public class DocumentController {
    @GetMapping("/all")
    public String getAll(){
        return "all";
    }
    @PostConstruct
    public void constructor(){
        System.out.println("cst");
    }
}
