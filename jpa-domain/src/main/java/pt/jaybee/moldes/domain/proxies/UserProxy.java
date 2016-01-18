package pt.jaybee.moldes.domain.proxies;


import pt.jaybee.moldes.domain.awareness.EntityAware;
import pt.jaybee.moldes.domain.entities.UserEntity;
import pt.jaybee.moldes.service.facades.user.User;

public class UserProxy implements EntityAware<UserEntity>, User {

    private UserEntity entity;

    @Override
    public UserEntity getEntity() {
        return entity;
    }

    @Override
    public void setEmail(String email) {
        entity.setEmail(email);
    }

    @Override
    public void setUsername(String username) {
        entity.setUsername(username);
    }

    @Override
    public void setPassword(String password) {
        entity.setPassword(password);
    }

    @Override
    public Integer getId() {
        return entity.getId();
    }

    @Override
    public String getEmail() {
        return entity.getEmail();
    }

    @Override
    public String getUsername() {
        return entity.getUsername();
    }

    public String getPassword() {
        return entity.getPassword();
    }
}
