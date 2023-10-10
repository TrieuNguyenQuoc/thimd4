package com.example.thi_md4.Controller;

import com.example.thi_md4.Service.IClassroomService;
import com.example.thi_md4.modle.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/classroom")
public class ClassroomControllerAPI {
    @Autowired
    private IClassroomService classroomService;
    @GetMapping
    public ResponseEntity<Iterable<Classroom>> findAll() {
        Iterable<Classroom> classrooms = classroomService.findAll();
        return new ResponseEntity<>(classrooms, HttpStatus.OK);
    }
}
