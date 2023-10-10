package com.example.thi_md4.Service.Impl;

import com.example.thi_md4.Service.IClassroomService;
import com.example.thi_md4.modle.Classroom;
import com.example.thi_md4.repository.IClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ClassroomService implements IClassroomService {
    @Autowired
    public IClassroomRepository iClassroomRepository;
    @Autowired
    public ClassroomService ClassroomService;

    @Override
    public Iterable<Classroom> findAll ( ) {
        return iClassroomRepository.findAll();
    }

    @Override
    public Optional<Classroom> findById (Long id) {
        return iClassroomRepository.findById(id);
    }

    @Override
    public Classroom save (Classroom nation) {
        return iClassroomRepository.save(nation);
    }

    @Override
    public void delete (Long id) {
        iClassroomRepository.deleteById(id);
    }

    {

    }
}
