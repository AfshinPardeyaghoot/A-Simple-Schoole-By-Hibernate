package ir.school;

import ir.school.dao.StudentDao;
import ir.school.entities.Student;
import ir.school.util.JPAUtil;

import javax.persistence.EntityManager;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) {



        Date birthDate = new Date();
        birthDate.setYear(1999);



        Student afshin = new Student();
        afshin.setFirstName("Afshin");
        afshin.setLastName("Pardeyaghoot");
        afshin.setStudentCode(1);
        afshin.setBirthDate(birthDate);



    }
}
