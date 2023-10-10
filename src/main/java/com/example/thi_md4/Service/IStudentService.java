package com.example.thi_md4.Service;

import com.example.thi_md4.modle.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService extends IGenerateService<Student>{
    List<Student> searchByName(String name);

    Optional<Student> findOne (Long id);
}
