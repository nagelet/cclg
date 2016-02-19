package models;

import play.db.jpa.GenericModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comptabilitat that = (Comptabilitat) o;

        if (id != that.id) return false;
        if (assentament != null ? !assentament.equals(that.assentament) : that.assentament != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (importCredit != null ? !importCredit.equals(that.importCredit) : that.importCredit != null) return false;
        if (importDebit != null ? !importDebit.equals(that.importDebit) : that.importDebit != null) return false;
        if (centreCost != null ? !centreCost.equals(that.centreCost) : that.centreCost != null) return false;
        if (descripcio != null ? !descripcio.equals(that.descripcio) : that.descripcio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (assentament != null ? assentament.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (importCredit != null ? importCredit.hashCode() : 0);
        result = 31 * result + (importDebit != null ? importDebit.hashCode() : 0);
        result = 31 * result + (centreCost != null ? centreCost.hashCode() : 0);
        result = 31 * result + (descripcio != null ? descripcio.hashCode() : 0);
        return result;
    }
}
