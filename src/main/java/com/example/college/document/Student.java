package com.example.college.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private String id;
    private String nombre;
    private String genero;
    private String fecha_nac;
    private String tipo_doc;
    private String documento;
}
