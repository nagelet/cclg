package models;

import play.db.jpa.GenericModel;

import javax.persistence.*;

/**
 * @author agne
 */
@Entity
@Table(name = "pla_comptable")
public class PlaComptable extends GenericModel {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int id;

    @Column(name = "codi", nullable = true, length = 50)
    public String codi;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaComptable that = (PlaComptable) o;

        if (id != that.id) return false;
        if (codi != null ? !codi.equals(that.codi) : that.codi != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (codi != null ? codi.hashCode() : 0);
        return result;
    }
}
