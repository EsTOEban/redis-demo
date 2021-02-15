package com.estoeban.redisdemo.service.impl;

import com.estoeban.redisdemo.entity.Student;
import com.estoeban.redisdemo.repository.StudentRepository;
import com.estoeban.redisdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService {

    final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public void addNewStudent(Student student) {

        studentRepository.save(student);

    }

}
