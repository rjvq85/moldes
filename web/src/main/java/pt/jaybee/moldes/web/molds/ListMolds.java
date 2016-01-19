package pt.jaybee.moldes.web.molds;

import pt.jaybee.moldes.service.business.MoldBusiness;
import pt.jaybee.moldes.service.facades.mold.Mold;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.Collections;
import java.util.List;

@Named
@RequestScoped
public class ListMolds {

    @EJB
    private MoldBusiness business;

    private List<Mold> allMolds;

    private Boolean ascOrder = true;

    public List<Mold> getAllMolds() {
        if (null == allMolds) allMolds = business.getAll();
        return allMolds;
    }

    public void setAllMolds(List<Mold> allMolds) {
        this.allMolds = allMolds;
    }

    public String orderList() {
        if (ascOrder) {
            Collections.sort(allMolds,((o1, o2) -> (o1.getPerson().compareTo(o2.getPerson()))));
            ascOrder = false;
        } else {
            Collections.sort(allMolds,((o1, o2) -> (o1.getPerson().compareTo(o2.getPerson()))));
            ascOrder = true;
        }
        return null;
    }
}
