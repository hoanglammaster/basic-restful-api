package vn.com.viettel.vds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.viettel.vds.entity.Student;
import vn.com.viettel.vds.repository.StudentRepository;

import java.util.Optional;

@Service
public class StudentService {

    /*
    service, entity, repository = luc truoc component de goi chung, sau nay moi chia ra
    component co nghia la: nhung class duoc chu thich, se duoc load vao cai THUNG CHUA(IOC) inversion of control
    muc dich de tu dong Injection ( tiem phu thuoc )

    class B{
        doSt();
    }

    class A{
        B b = new B();
        b.doSt();
    }

    Injection:
     class B{
        doSt();
    }

    class A{
        B b;
        public A(B b){
            this.b = b;
        }

        b.doSt();
    }
     */

    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student getStudentById(Long id){
        Optional<Student> studentOptional =  repository.findStudentById(id);
        if(studentOptional.isPresent()){
            return studentOptional.get();
        }else{
            return null;
        }
    }
}
