package ir.school.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

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

    @ManyToMany
    @JoinTable(
            name = "student_teacher",
            joinColumns = @JoinColumn(name = "fk_student_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_teacher_id")
    )
    private Set<Teacher> teachers ;

    @ManyToOne
    @JoinColumn(name = "fk_student_address",nullable = false)
    private Address address ;

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

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
