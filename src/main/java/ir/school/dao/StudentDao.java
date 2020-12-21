package ir.school.dao;
import ir.school.entities.Student;
import javax.persistence.EntityManager;

public class StudentDao extends AbstractEntityDao<Student,Integer> {

    public StudentDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Student> getClassType() {
        return Student.class;
    }

}
