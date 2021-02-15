package com.estoeban.redisdemo.controlller;

import com.estoeban.redisdemo.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class StudentController {

    @GetMapping("/student/{name}")
    public ResponseEntity<Student> getStudent(
            @PathVariable String name) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/students")
    public ResponseEntity<Student> getAllStudents() {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping("/student/add/{name}")
    public ResponseEntity<Student> addStudent(
            @PathVariable String name) {


        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


}
