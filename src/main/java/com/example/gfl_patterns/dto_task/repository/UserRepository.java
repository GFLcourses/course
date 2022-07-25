package com.example.gfl_patterns.dto_task.repository;

import com.example.gfl_patterns.dto_task.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserCustomRepository{
}
