package models;

import play.db.jpa.GenericModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author agne
 */
@Entity
public class Quotes extends GenericModel {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int id;

    @Column(name = "tipusQuota", nullable = false, length = 50)
    public String tipusQuota;

    @Column(name = "import", nullable = false)
    public int valor;

    @Column(name = "anyVigent", nullable = false)
    public int anyVigent;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quotes quotes = (Quotes) o;

        if (id != quotes.id) return false;
        if (valor != quotes.valor) return false;
        if (anyVigent != quotes.anyVigent) return false;
        if (tipusQuota != null ? !tipusQuota.equals(quotes.tipusQuota) : quotes.tipusQuota != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tipusQuota != null ? tipusQuota.hashCode() : 0);
        result = 31 * result + valor;
        result = 31 * result + anyVigent;
        return result;
    }
}
