package pt.jaybee.moldes.domain.persistence;

import pt.jaybee.moldes.service.facades.user.User;
import pt.jaybee.moldes.service.facades.user.UserPersistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class UserPersistenceImpl implements UserPersistence {

    @PersistenceContext(unitName = "PostgreSQLDS")
    private EntityManager em;

    @Override
    public void create(User user) {

    }

    @Override
    public User retrieve(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(User user) {

    }
}
