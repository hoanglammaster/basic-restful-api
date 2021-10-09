package vn.com.viettel.vds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.com.viettel.vds.entity.Student;
import vn.com.viettel.vds.service.StudentService;

//tra ve du lieu cho api
@RestController
@RequestMapping("api/v1/student")
//khi user goi localhost:8080/api/v1/student thi no se goi toi controller nay
public class StudentController {

    private final StudentService studentService;

    //tu dong injection
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//    @PostMapping
    //vidu: /find/7 => id = 7
    @GetMapping(path = "/find/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id){
        Student student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

}


