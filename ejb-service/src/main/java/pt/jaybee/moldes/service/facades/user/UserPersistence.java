package pt.jaybee.moldes.service.facades.user;


public interface UserPersistence {

    void create(User user);

    User retrieve(User user);

    User update(User user);

    void delete(User user);

}
