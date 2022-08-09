package com.bythepeople.watcher.models;

//mport org.springframework.stereotype.Indexed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Questions {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String questions;

    public String getQuestions() {
        return questions;
    }
    public void setQuestions(String questions) {
        this.questions = questions;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
}
