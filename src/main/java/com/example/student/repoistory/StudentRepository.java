package com.example.student.repoistory;

import com.example.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student,Integer> {
 List<Student> findAllBySchoolId(Integer schoolId);
}
