package com.example.college.service.implementation;

import com.example.college.document.Student;
import com.example.college.repository.StudentsRepository;
import com.example.college.service.Inter_StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplStudentsService implements Inter_StudentsService {

    @Autowired
    private StudentsRepository objStudenRepository;

    public List<Student> getAll() {
        return objStudenRepository.findAll();
    }

    public Student findStudentByNroDoc(String nroDoc){
        return (Student) objStudenRepository.getStudentByDocumento(nroDoc);
    }
}
