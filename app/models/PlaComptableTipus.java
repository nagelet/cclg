package models;

import play.db.jpa.GenericModel;

import javax.persistence.*;

/**
 * @author agne
 */
@Entity
@Table(name = "pla_comptable_tipus")
public class PlaComptableTipus extends GenericModel {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int id;

    @Column(name = "tipus", nullable = true, length = 11)
    public String tipus;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaComptableTipus that = (PlaComptableTipus) o;

        if (id != that.id) return false;
        if (tipus != null ? !tipus.equals(that.tipus) : that.tipus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tipus != null ? tipus.hashCode() : 0);
        return result;
    }
}
