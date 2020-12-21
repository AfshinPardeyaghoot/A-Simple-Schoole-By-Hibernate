package ir.school.dao;
import ir.school.entities.Address;
import javax.persistence.EntityManager;


public class AddressDao extends AbstractEntityDao<Address,Integer> {
    public AddressDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Address> getClassType() {
        return null;
    }
}
