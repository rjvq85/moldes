package pt.jaybee.moldes.service.business;

import pt.jaybee.moldes.service.facades.mold.Mold;
import pt.jaybee.moldes.service.facades.mold.MoldPersistence;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class MoldBusiness {

    @EJB
    private MoldPersistence persistence;

    public void newLoadedMold(Mold m) {
        persistence.create(m);
    }

    public List<Mold> getAll() {
        return persistence.retrieveAll();
    }
}
