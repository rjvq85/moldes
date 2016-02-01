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

    public Mold addQuantity(Mold m, Integer type) {
        if (type == 0) {
            m.setSilverQt(m.getSilverQt() + 1);
        } else {
            m.setGoldQt(m.getGoldQt() + 1);
        }
        m = persistence.update(m);
        return m;
    }

    public Mold removeQuantity(Mold m, Integer type) {
        if (type == 0) {
            if (m.getSilverQt() > 0) m.setSilverQt(m.getSilverQt() - 1);
        } else {
            if (m.getGoldQt() > 0) m.setGoldQt(m.getGoldQt() - 1);
        }
        m = persistence.update(m);
        return m;
    }
}
