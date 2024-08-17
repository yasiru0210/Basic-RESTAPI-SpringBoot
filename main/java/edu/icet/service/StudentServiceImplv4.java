package edu.icet.service;

import edu.icet.dto.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Primary
@Service
public class StudentServiceImplv4 implements StudentService {
List<Student> studentList=new ArrayList<>();
    @Override
    public void addData(Student student){

        studentList.add(student);
    }
    @Override
    public List<Student> getData(){
        studentList.add(new Student(1, "Yasiru", "Panadura", 22, "Mavittra", "Painting"));
        studentList.add(new Student(1,"Kasiru","Panadura",31, "Piliyandala", "Nampamunuwa", "Painting"));
        studentList.add(new Student(1,"Lasiru","Piliyandala",12,"Nampamunuwa","Swimming" ));
        studentList.add(new Student(6,"Kasun","Colombo",34,"Galle","Hiking"));

         return studentList;


    }

}
