package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    protected final StudentService service;

    @Autowired
    public StudentController(@Qualifier("studentServiceImplv3") StudentService service) {
        this.service = service;
    }

    @GetMapping("/get-data")
    public List<Student> getData() {
        return service.getData();
    }

    @PostMapping("/add-data")
    public void addData(@RequestBody Student student) {
        service.addData(student);
    }
}

