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
public class Obertura extends GenericModel {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int id;

    @Column(name = "concepte", nullable = true, length = 25)
    public String concepte;

    @Column(name = "tipus", nullable = true, length = 11)
    public String tipus;

    @Column(name = "import", nullable = true, precision = 0)
    public Double valor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Obertura obertura = (Obertura) o;

        if (id != obertura.id) return false;
        if (concepte != null ? !concepte.equals(obertura.concepte) : obertura.concepte != null) return false;
        if (tipus != null ? !tipus.equals(obertura.tipus) : obertura.tipus != null) return false;
        if (valor != null ? !valor.equals(obertura.valor) : obertura.valor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (concepte != null ? concepte.hashCode() : 0);
        result = 31 * result + (tipus != null ? tipus.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        return result;
    }
}
