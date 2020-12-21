package ir.school.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id ;

    @Column(name = "first_name",nullable = false)
    private String firstName ;

    @Column(name = "last_name",nullable = false)
    private String lastName ;

    @Column(name = "teacher_code",unique = true , nullable = false)
    private Integer teacherCode ;

    @Column(name = "salary",nullable = false)
    private Double salary ;

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

    public Integer getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(Integer teacherCode) {
        this.teacherCode = teacherCode;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
