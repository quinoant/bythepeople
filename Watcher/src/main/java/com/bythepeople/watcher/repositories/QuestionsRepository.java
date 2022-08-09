package com.bythepeople.watcher.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bythepeople.watcher.models.Questions;

public interface QuestionsRepository extends JpaRepository<Questions, Long>{
    
}
