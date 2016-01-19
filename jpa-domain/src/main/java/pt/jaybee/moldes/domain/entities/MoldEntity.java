package pt.jaybee.moldes.domain.entities;

import pt.jaybee.moldes.service.utils.mold.Person;

import javax.persistence.*;

@Entity
@Table(name = "moldes")
@NamedQueries({
        @NamedQuery(name = "Mold.getAll",query = "SELECT m FROM MoldEntity m")
})
public class MoldEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "referencia",length = 999)
    private String reference;

    @Column(name = "quantidade_prata")
    private Integer silverQt;

    @Column(name = "quantidade_ouro")
    private Integer goldQt;

    @Enumerated(EnumType.STRING)
    @Column(name = "responsavel")
    private Person person;

    public Integer getId() {
        return id;
    }

    public String getReference() {

        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getSilverQt() {
        return silverQt;
    }

    public void setSilverQt(Integer silverQt) {
        this.silverQt = silverQt;
    }

    public Integer getGoldQt() {
        return goldQt;
    }

    public void setGoldQt(Integer goldQt) {
        this.goldQt = goldQt;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
