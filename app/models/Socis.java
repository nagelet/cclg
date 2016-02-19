package models;

import play.db.jpa.GenericModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author agne
 */
@Entity
public class Socis extends GenericModel {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int id;

    @Column(name = "nom", nullable = false, length = 50)
    public String nom;

    @Column(name = "tipusSoci", nullable = true)
    public Integer tipusSoci;

    @Column(name = "adressa", nullable = true, length = 200)
    public String adressa;

    @Column(name = "codiPostal", nullable = true, length = 10)
    public String codiPostal;

    @Column(name = "poblacio", nullable = true, length = 50)
    public String poblacio;

    @Column(name = "circular", nullable = true, length = 50)
    public String circular;

    @Column(name = "butlleti", nullable = true, length = 50)
    public String butlleti;

    @Column(name = "conegut", nullable = true, length = 200)
    public String conegut;

    @Column(name = "comentaris", nullable = true, length = 500)
    public String comentaris;

    @Column(name = "actiu", nullable = false)
    public boolean actiu;

    @Column(name = "familia", nullable = true, length = 15)
    public String familia;

    @Column(name = "dataAlta", nullable = true)
    public Date dataAlta;
}
