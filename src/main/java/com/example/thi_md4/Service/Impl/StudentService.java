package com.example.thi_md4.Service.Impl;

import com.example.thi_md4.Service.IStudentService;
import com.example.thi_md4.modle.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class StudentService implements IStudentService {
@Autowired
    public IStudentService iStudentRepository;
    @Override
    public Iterable<Student> findAll() {
        return iStudentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return iStudentRepository.findById(id);
    }

    @Override
    public Student save(Student student) {
        return iStudentRepository.save(student);
    }

    @Override
    public void delete(Long id) {iStudentRepository.delete(id);}

    @Override
    public List<Student> searchByName (String name) {
        return null;
    }

    @Override
    public Optional<Student> findOne (Long id) {
        return Optional.empty();
    }
}