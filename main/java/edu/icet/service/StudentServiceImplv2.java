package edu.icet.service;

import edu.icet.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentServiceImplv2 implements StudentService {
List<Student> studentList=new ArrayList<>();
    @Override
    public void addData(Student student){

        studentList.add(student);
    }
    @Override
    public List<Student> getData(){
        studentList.add(new Student(1,"Yasiru","Panadura",31));
        return studentList;
    }

}
