package pt.jaybee.moldes.web.molds;

import pt.jaybee.moldes.service.business.MoldBusiness;
import pt.jaybee.moldes.service.facades.mold.Mold;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class ChangeMold implements Serializable {

    private static final long serialVersionUI = 123L;

    @EJB
    private MoldBusiness business;

    public void add(Mold m, Integer type) {
        business.addQuantity(m, type);
    }

    public void remove(Mold m, Integer type) {
        business.removeQuantity(m, type);
    }

}
