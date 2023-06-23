package com.example.learnjwt;

import com.example.learnjwt.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> user= new ArrayList<>();
    public UserService(){
        user.add(new User(1,"Shashi","shashi@gmail.com"));
        user.add(new User(2,"durgesh","shashi2@gmail.com"));
        user.add(new User(3,"amit","shashi3@gmail.com"));

    }
    public List<User>getUser(){
        return this.user;
    }
}
