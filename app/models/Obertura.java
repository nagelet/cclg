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

}
