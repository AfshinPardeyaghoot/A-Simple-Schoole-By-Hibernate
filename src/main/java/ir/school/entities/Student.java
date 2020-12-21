package ir.school.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "first_name" , nullable = false)
    private String firstName ;

    @Column(name = "last_name" , nullable = false)
    private String lastName ;

    @Column(name = "student_code",nullable = false,unique = true)
    private Integer studentCode ;

    @Column(name = "birth_date",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birthDate ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(Integer studentCode) {
        this.studentCode = studentCode;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
