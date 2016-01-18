package pt.jaybee.moldes.domain.builders;

import pt.jaybee.moldes.domain.proxies.UserProxy;
import pt.jaybee.moldes.service.facades.user.UserBuilder;
import pt.jaybee.moldes.service.facades.user.User;

import javax.ejb.Stateless;

@Stateless
public class UserBuilderImpl implements UserBuilder {

    private UserProxy proxy;

    public UserBuilderImpl() {
        this(null);
    }

    public UserBuilderImpl(UserProxy proxy) {
        this.proxy = (null != proxy) ? proxy : new UserProxy();
    }

    @Override
    public UserBuilder email(String email) {
        proxy.setEmail(email);
        return this;
    }

    @Override
    public UserBuilder password(String password) {
        proxy.setPassword(password);
        return this;
    }

    @Override
    public UserBuilder username(String username) {
        proxy.setUsername(username);
        return this;
    }

    @Override
    public User build() {
        return proxy;
    }
}
