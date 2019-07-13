package com.example.entityassociation.repository;

import com.example.entityassociation.model.oneToOne.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReposity extends JpaRepository<Student, Long> {
}
