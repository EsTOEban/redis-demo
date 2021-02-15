package com.estoeban.redisdemo.service;

import com.estoeban.redisdemo.entity.Student;
import com.estoeban.redisdemo.repository.StudentRepository;

public interface StudentService {

    void addNewStudent(Student student);
}
