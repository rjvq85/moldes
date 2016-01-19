package pt.jaybee.moldes.domain.builders;


import pt.jaybee.moldes.domain.proxies.MoldProxy;
import pt.jaybee.moldes.service.facades.mold.Mold;
import pt.jaybee.moldes.service.facades.mold.MoldBuilder;
import pt.jaybee.moldes.service.utils.mold.Person;

import javax.ejb.Stateless;

@Stateless
public class MoldBuilderImpl implements MoldBuilder {

    private MoldProxy proxy;

    public MoldBuilderImpl() {
        proxy = new MoldProxy();
    }

    public MoldBuilderImpl(MoldProxy proxy) {
        this.proxy = proxy;
    }

    @Override
    public MoldBuilder reference(String reference) {
        proxy.setReference(reference);
        return this;
    }

    @Override
    public MoldBuilder silverQuantity(Integer silverQt) {
        proxy.setSilverQt(silverQt);
        return this;
    }

    @Override
    public MoldBuilder goldQuantity(Integer goldQt) {
        proxy.setGoldQt(goldQt);
        return this;
    }

    @Override
    public MoldBuilder person(Person person) {
        proxy.setPerson(person);
        return this;
    }

    @Override
    public Mold build() {
        return proxy;
    }
}
