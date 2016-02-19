package models;

import play.db.jpa.GenericModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author agne
 */
@Entity
public class Comptabilitat extends GenericModel {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int id;

    @Column(name = "assentament", nullable = true)
    public Integer assentament;

    @Column(name = "data", nullable = true)
    public Date data;

    @Column(name = "import_credit", nullable = true, precision = 2)
    public BigDecimal importCredit;

    @Column(name = "import_debit", nullable = true, precision = 2)
    public BigDecimal importDebit;

    @Column(name = "centre_cost", nullable = true, length = 25)
    public String centreCost;

    @Column(name = "descripcio", nullable = true, length = 500)
    public String descripcio;

}
