package pt.jaybee.moldes.service.facades.mold;


import java.util.List;

public interface MoldPersistence {

    void create(Mold mold);

    Mold retrieve(Mold mold);

    Mold update(Mold mold);

    void delete(Mold mold);

    List<Mold> retrieveAll();
}
