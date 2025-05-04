package com.api.student.Controller;


import com.api.student.Entity.Student;
import com.api.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){

        return this.studentService.createstudentobj(student);
    }

@GetMapping("/create")
    public List<Student> getallStudent(){

//    String st=null;
//    System.out.println(st.length());
      return this.studentService.getallStudent();



    }

    @GetMapping("/create/{sid}")
    public Student getStudentByid(@PathVariable("sid") int id){

        //return  ResponseEntity.of(Optional.of(this.studentService.getStudentByid(id)));

        //return new ResponseEntity<Student>(this.studentService.getStudentByid(id), HttpStatus.FOUND);

        return this.studentService.getStudentByid(id);

    }

    @DeleteMapping("/create/{sid}")
    public void deleteStudent(@PathVariable("sid") int id){

        this.studentService.deletestudent(id);
    }

    @PutMapping("/create/{sid}")
    public void UpdateStudent(@PathVariable("sid") int id,@RequestBody Student student){

        this.studentService.updateStudent(id,student);
    }



}
