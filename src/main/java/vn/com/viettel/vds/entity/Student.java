package vn.com.viettel.vds.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//chu thich entity
@Entity
// chi dinh ten cho tables trong database
@Table(name = "students")
//nang cao: dung lombok
//Constructor no se tu dong tao ham constructor
@AllArgsConstructor
@NoArgsConstructor
//tu dong tao setter getter
@Setter
@Getter
public class Student {

    @Id
    private Long id;
    private String name;
}
