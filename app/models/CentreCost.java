package models;

import play.db.jpa.GenericModel;

import javax.persistence.*;


/**
 * @author agne
 */
@Entity
@Table(name = "centre_cost")
public class CentreCost extends GenericModel {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int id;

    @Column(name = "codi", nullable = true, length = 25)
    public String codi;

    @Column(name = "tipus", nullable = true, length = 25)
    public String tipus;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CentreCost that = (CentreCost) o;

        if (id != that.id) return false;
        if (codi != null ? !codi.equals(that.codi) : that.codi != null) return false;
        if (tipus != null ? !tipus.equals(that.tipus) : that.tipus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (codi != null ? codi.hashCode() : 0);
        result = 31 * result + (tipus != null ? tipus.hashCode() : 0);
        return result;
    }
}
