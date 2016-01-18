package pt.jaybee.moldes.service.facades.user;

public interface UserBuilder {

    UserBuilder email(String email);
    UserBuilder password(String password);
    UserBuilder username(String username);
    User build();

}
