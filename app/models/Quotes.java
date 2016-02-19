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

}
