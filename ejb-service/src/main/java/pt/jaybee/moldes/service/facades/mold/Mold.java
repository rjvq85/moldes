package pt.jaybee.moldes.service.facades.mold;

import pt.jaybee.moldes.service.utils.mold.Person;

public interface Mold {

    Integer getId();

    String getReference();

    void setReference(String reference);

    Integer getSilverQt();

    void setSilverQt(Integer silverQt);

    Integer getGoldQt();

    void setGoldQt(Integer goldQt);

    Person getPerson();

    void setPerson(Person person);
}
