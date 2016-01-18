package pt.jaybee.moldes.web.access;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Named
@RequestScoped
public class Login {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        try {
            getRequest().login(username, password);
            saveUsername();
            return "success";
        } catch (ServletException e) {
            e.printStackTrace();
            return "failure";
        }

    }

    private HttpServletRequest getRequest() {
        return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
    }

    private void saveUsername() {
        getRequest().getSession().setAttribute("usernameLogin", username);
    }

}
