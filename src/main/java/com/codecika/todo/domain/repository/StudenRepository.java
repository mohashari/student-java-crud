package com.codecika.todo.domain.repository;

import com.codecika.todo.domain.presistance.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudenRepository extends JpaRepository<Student,Integer> {

}
