package edu.icet.service;

import edu.icet.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class StudentServiceImpl implements StudentService {
List<Student> studentList=new ArrayList<>();
    @Override
    public void addData(Student student){
          studentList.add(student);
    }
    @Override
    public Student getData(){
        return studentList;
    }

}
