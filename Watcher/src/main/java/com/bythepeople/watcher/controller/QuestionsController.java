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

import com.bythepeople.watcher.models.Questions;
import com.bythepeople.watcher.repositories.QuestionsRepository;;
@RestController
@RequestMapping("/api/v1/questions")
public class QuestionsController {
    @Autowired
    private QuestionsRepository questionsRepository;

    
    @GetMapping
    public List<Questions> list() {
        //Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return questionsRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Questions questions) {
        questionsRepository.save(questions);
    }

    @GetMapping("/{id}")
    public Questions get(@PathVariable("id") long id){
        return questionsRepository.getReferenceById(id);
    }
}
