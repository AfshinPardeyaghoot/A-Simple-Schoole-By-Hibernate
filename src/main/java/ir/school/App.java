package ir.school;

import ir.school.dao.AddressDao;
import ir.school.dao.StudentDao;
import ir.school.dao.TeacherDao;
import ir.school.entities.Address;
import ir.school.entities.Student;
import ir.school.entities.Teacher;
import ir.school.util.JPAUtil;
import org.hibernate.type.descriptor.sql.NVarcharTypeDescriptor;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class App {

    private static StudentDao studentDao;
    private static TeacherDao teacherDao;
    private static AddressDao addressDao;

    public static void main(String[] args) {

        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        initialDao(entityManager);
//
//
//
//        Address address1 = saveAddress("553546778","Tehran");
//        Address address2 = saveAddress("55354543","Los Angles");
//
//        Student afshin = saveStudent("Afshin","Pardeyaghoot",1,generateBirthDate(),address1);
//        Student ali = saveStudent("Ali","Parvar",2,generateBirthDate(),address2);
//        Student hasan = saveStudent("Hasan","Rastin",3,generateBirthDate(),address1);
//
//        Set<Student> students1 = new HashSet<>();
//        students1.add(hasan);
//        students1.add(afshin);
//
//        Set<Student> students2 = new HashSet<>();
//        students2.add(ali);
//
//
//        saveTeacher("Sadegh","Ahmadi",1,1400.00,generateBirthDate(),address1,students1);
//        saveTeacher("Rahim","Alipour",2,16700.99,generateBirthDate(),address1,students2);

//=======================================================================================================

//        using load
//        Student omid = saveStudent("Omid","Rostami",4,generateBirthDate(),addressDao.load(2));
//        System.out.println(studentDao.load(3).getFirstName());

//        using update
//        Teacher teacher = teacherDao.load(2);
//        Set<Student> students = teacher.getStudents();
//        students.add(studentDao.load(4)) ;
//        teacher.setStudents(students);
//        teacherDao.update(teacher);



        entityManager.getTransaction().commit();
        entityManager.close();
        JPAUtil.shutdown();

    }

    private static void initialDao(EntityManager entityManager){
        studentDao = new StudentDao(entityManager);
        teacherDao = new TeacherDao(entityManager);
        addressDao = new AddressDao(entityManager);
    }

    private static Student saveStudent(String firstName, String lastName, Integer stdCode, Date birthDate, Address address) {
        Student student = new Student(firstName, lastName, stdCode, birthDate, address);
        studentDao.save(student);
        return student ;
    }

    private static Address saveAddress(String number, String city, String state, String postalCode, String postalAddress) {
        Address address = new Address(number, state, city, postalCode, postalAddress);
        addressDao.save(address);
        return address ;
    }

    private static Address saveAddress(String number, String city) {
        Address address = new Address(number, city);
        addressDao.save(address);
        return address ;
    }

    private static void saveTeacher(String firstName, String lastName, Integer teacherCode,
                                    Double salary, Date birthDate, Address address, Set<Student> students) {

        Teacher teacher = new Teacher(firstName, lastName, teacherCode, salary, birthDate, students, address);
        teacherDao.save(teacher);
    }

    private static Date generateBirthDate(){
        int day = (int) ( Math.random()*(30) + 1 );
        int month = (int) ( Math.random()*(12) +1 ) ;
        int year = (int) (Math.random()*(2020-1950+1) + 1) ;
        return new Date(year,month,day) ;
    }
}