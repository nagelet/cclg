package helpers.jaxb.postfinance.mapper;

import helpers.jaxb.postfinance.generated.IC;
import helpers.jaxb.postfinance.generated.KONAUS;
import helpers.jaxb.postfinance.generated.SG4;
import models.Comptabilitat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author agne
 */
public class PostfinanceMapper {

    public List<Comptabilitat> toComptabilitat(IC ic) throws ParseException {
        List<Comptabilitat> comptes = new ArrayList<>();

        for (KONAUS konaus : ic.getKONAUS()) {
            for (SG4 statement : konaus.getSG4()) {
                Comptabilitat compte = new Comptabilitat();
                compte.descripcio = statement.getFTX().get(0).getC108().toString();
                compte.data = new SimpleDateFormat("yyyymmdd").parse(statement.getSG5().getDTM().getC507().getD2380().getvalue());
            }
        }

        return comptes;
    }
}
