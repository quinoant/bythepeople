package com.bythepeople.watcher.controller;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bythepeople.watcher.models.Users;
import com.bythepeople.watcher.repositories.UsersRepository;
@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;

    
    @GetMapping
    public List<Users> list() {
        //Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return usersRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Users users) {
        usersRepository.save(users);
    }

    @GetMapping("/{id}")
    public Users get(@PathVariable("id") long id){
        return usersRepository.getReferenceById(id);
    }
}
