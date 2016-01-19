package pt.jaybee.moldes.service.facades.mold;


import pt.jaybee.moldes.service.utils.mold.Person;

public interface MoldBuilder {

    MoldBuilder reference(String reference);
    MoldBuilder silverQuantity(Integer silverQt);
    MoldBuilder goldQuantity(Integer goldQt);
    MoldBuilder person(Person person);
    Mold build();

}
