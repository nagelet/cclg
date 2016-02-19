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

}
