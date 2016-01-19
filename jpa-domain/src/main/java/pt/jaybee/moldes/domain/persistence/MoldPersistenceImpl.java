package pt.jaybee.moldes.domain.persistence;

import pt.jaybee.moldes.domain.awareness.EntityAware;
import pt.jaybee.moldes.domain.entities.MoldEntity;
import pt.jaybee.moldes.service.facades.mold.Mold;
import pt.jaybee.moldes.service.facades.mold.MoldPersistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MoldPersistenceImpl implements MoldPersistence {

    @PersistenceContext(unitName = "PostgreSQLDS")
    private EntityManager em;

    @Override
    public void create(Mold mold) {
        MoldEntity entity = getEntity(mold);
        em.merge(entity);
    }

    @Override
    public Mold retrieve(Mold mold) {
        return null;
    }

    @Override
    public Mold update(Mold mold) {
        return null;
    }

    @Override
    public void delete(Mold mold) {

    }

    private MoldEntity getEntity(Mold mold) {
        if (mold instanceof EntityAware<?>)
            return ((EntityAware<MoldEntity>) mold).getEntity();
        else return null;
    }

}
