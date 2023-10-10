package com.example.thi_md4.repository;

import com.example.thi_md4.modle.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudenRepository extends JpaRepository<Student,Long> {
}
