package com.example.thi_md4.Controller;

import com.example.thi_md4.Service.IStudentService;
import com.example.thi_md4.modle.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class StudentControllerAPI {
    @Autowired
    private IStudentService studentService;

    @GetMapping
    public ResponseEntity<Iterable<Student>> findAll() {
        Iterable<Student> students = studentService.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findOne(@PathVariable("id") Long id) {
        Optional<Student> studentOptional = studentService.findOne(id);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            return new ResponseEntity<>(student, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Student student) {
        studentService.save(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        studentService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<Student>> searchByName(@PathVariable("name") String name) {
        List<Student> students = studentService.searchByName(name);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}
