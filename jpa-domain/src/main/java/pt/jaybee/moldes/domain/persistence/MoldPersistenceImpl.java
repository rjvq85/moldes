package pt.jaybee.moldes.domain.persistence;

import pt.jaybee.moldes.domain.awareness.EntityAware;
import pt.jaybee.moldes.domain.entities.MoldEntity;
import pt.jaybee.moldes.domain.proxies.MoldProxy;
import pt.jaybee.moldes.service.facades.mold.Mold;
import pt.jaybee.moldes.service.facades.mold.MoldPersistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<Mold> retrieveAll() {
        TypedQuery<MoldEntity> query = em.createNamedQuery("Mold.getAll",MoldEntity.class);
        return query.getResultList().stream().map(e -> new MoldProxy(e)).collect(Collectors.toList());
    }

    private MoldEntity getEntity(Mold mold) {
        if (mold instanceof EntityAware<?>)
            return ((EntityAware<MoldEntity>) mold).getEntity();
        else return null;
    }

}
