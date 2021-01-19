package com.example.college.repository;

import com.example.college.document.Student;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepository extends MongoRepository<Student,String> {

    List<Student> getStudentByDocumento(String nrodoc);
    List<Student> getStudentByNombre(String nrodoc);

}
