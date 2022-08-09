package com.bythepeople.watcher.models;

//mport org.springframework.stereotype.Indexed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import com.bythepeople.watcher.models.Users;

//import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UsersAnswers {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Users user;
    private Questions questions;
    private String usersAnswers;

    public String getQuestions() {
        return usersAnswers;
    }
    public void setQuestions(String usersAnswers) {
        this.usersAnswers = usersAnswers;
    }
    public Users getUser(){
        return user;
    }
    public void setUser(Users user){
        this.user = user;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
}
