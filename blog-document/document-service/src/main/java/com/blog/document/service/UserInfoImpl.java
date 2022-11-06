package com.blog.document.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserInfoImpl implements UserInfoI{
    @Override
    public List<String> getAll() {
        return new ArrayList<>();
    }
}
