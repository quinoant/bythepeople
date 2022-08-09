package com.bythepeople.watcher.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bythepeople.watcher.models.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
    
}
