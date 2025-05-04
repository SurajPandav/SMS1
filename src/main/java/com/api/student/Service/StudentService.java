package com.api.student.Service;

import com.api.student.Entity.Address;
import com.api.student.Entity.Student;
import com.api.student.GlobalException.Exception.StudentNotFound;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {


   private static List<Student> list=new ArrayList<>();

   static  {
        list.add(new Student(11,"Akash",new Address("pune","asd")));
       list.add(new Student(12,"Suraj",new Address("mumbai","ijf")));
       list.add(new Student(13,"Mahesh",new Address("sangli","hbdjk")));
    }

    public Student createstudentobj( Student student){

        list.add(student);

        return student;
    }

    public List<Student> getallStudent(){

       return list;
    }


    public Student getStudentByid(int id){
       Student s1=null;

       s1=list.stream().filter(b->b.getId()==id).findFirst().orElseThrow(()->new StudentNotFound("Student Detail not found"));

       return s1;
    }

   public void deletestudent(int id){

       list=list.stream().filter(d->d.getId()!=id).collect(Collectors.toList());
   }

   public void updateStudent(int id,Student st){

       Student student=list.stream().filter(i->i.getId()==id).findFirst().orElseThrow(()->new StudentNotFound("Student not found"));

       student.setName(st.getName());
       student.setAddress(st.getAddress());


   }
}
