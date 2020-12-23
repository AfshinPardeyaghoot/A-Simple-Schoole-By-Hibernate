package ir.school.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "teacher_student",
            joinColumns = @JoinColumn(name = "fk_teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_student_id")
    )
    private Set<Student> students ;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_teacher_address",nullable = false)
    private Address address ;

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

    public Teacher(String firstName, String lastName, Integer teacherCode, Double salary, Date birthDate, Set<Student> students, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teacherCode = teacherCode;
        this.salary = salary;
        this.birthDate = birthDate;
        this.students = students;
        this.address = address;
    }

    public Teacher() {
    }

    public Double getSalary() {
        return salary;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
