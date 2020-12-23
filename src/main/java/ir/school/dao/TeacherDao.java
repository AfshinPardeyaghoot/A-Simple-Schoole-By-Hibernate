package ir.school.dao;

import ir.school.entities.Teacher;

import javax.persistence.EntityManager;

public class TeacherDao extends AbstractEntityDao<Teacher,Integer> {
    public TeacherDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Teacher> getClassType() {
        return Teacher.class;
    }
}
