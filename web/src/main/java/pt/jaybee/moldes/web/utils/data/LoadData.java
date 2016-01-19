package pt.jaybee.moldes.web.utils.data;

import pt.jaybee.moldes.service.business.MoldBusiness;
import pt.jaybee.moldes.service.facades.mold.Mold;
import pt.jaybee.moldes.service.facades.mold.MoldBuilder;
import pt.jaybee.moldes.service.utils.mold.Person;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.*;

@Named
@RequestScoped
public class LoadData {

    @EJB
    private MoldBuilder builder;
    @EJB
    private MoldBusiness business;

    private final String FILE_PATH = System.getProperty("jboss.home.dir") + File.separator + "files" + File.separator + "utils" + File.separator;

    public String molds() {

        File molds = new File(FILE_PATH + "molds.csv");
        String line = "";
        String separation = ";";
        try {
            BufferedReader br = new BufferedReader(new FileReader(molds));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(separation);
                createMold(values);
            }
            return "success";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "failure";
        } catch (IOException e) {
            e.printStackTrace();
            return "failure";
        }

    }

    private void createMold(String[] values) {
        Person p = null;
        switch (values[3]) {
            case "Jaybee":
                p = Person.JB;
                break;
            case "Constante":
                p = Person.CO;
                break;
            case "Santos":
                p = Person.SA;
                break;
            default:
                p = Person.OU;
                break;
        }
        Mold m = builder.reference(values[0])
                .silverQuantity(Integer.valueOf(values[1]))
                .goldQuantity(Integer.valueOf(values[2]))
                .person(p)
                .build();
        business.newLoadedMold(m);
    }

}
