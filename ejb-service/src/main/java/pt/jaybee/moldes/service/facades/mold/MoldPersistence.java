package pt.jaybee.moldes.service.facades.mold;

/**
 * Created by rj-quirino on 19/01/2016.
 */
public interface MoldPersistence {

    void create(Mold mold);
    Mold retrieve(Mold mold);
    Mold update(Mold mold);
    void delete(Mold mold);

}
