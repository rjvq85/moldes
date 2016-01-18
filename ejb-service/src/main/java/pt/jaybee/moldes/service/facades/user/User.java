package pt.jaybee.moldes.service.facades.user;


public interface User {

    void setPassword(String password);

    String getUsername();

    void setUsername(String username);

    String getEmail();

    void setEmail(String email);

    Integer getId();

}
