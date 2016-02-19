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

}
