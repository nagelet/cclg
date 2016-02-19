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

}
