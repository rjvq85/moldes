package pt.jaybee.moldes.domain.proxies;

import pt.jaybee.moldes.domain.awareness.EntityAware;
import pt.jaybee.moldes.domain.entities.MoldEntity;
import pt.jaybee.moldes.service.utils.mold.Person;
import pt.jaybee.moldes.service.facades.mold.Mold;


public class MoldProxy implements Mold,EntityAware<MoldEntity> {

    private MoldEntity entity;

    public MoldProxy() {
        this(null);
    }

    public MoldProxy(MoldEntity mold) {
        entity = (null != mold) ? mold : new MoldEntity();
    }

    @Override
    public MoldEntity getEntity() {
        return entity;
    }

    @Override
    public Integer getId() {
        return entity.getId();
    }

    @Override
    public String getReference() {

        return entity.getReference();
    }
    @Override
    public void setReference(String reference) {
        entity.setReference(reference);
    }
    @Override
    public Integer getSilverQt() {
        return entity.getSilverQt();
    }
    @Override
    public void setSilverQt(Integer silverQt) {
        entity.setSilverQt(silverQt);
    }
    @Override
    public Integer getGoldQt() {
        return entity.getGoldQt();
    }
    @Override
    public void setGoldQt(Integer goldQt) {
        entity.setGoldQt(goldQt);
    }
    @Override
    public Person getPerson() {
        return entity.getPerson();
    }
    @Override
    public void setPerson(Person person) {
        entity.setPerson(person);
    }
}
