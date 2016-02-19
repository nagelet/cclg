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
public class Persones extends GenericModel {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int id;

    @Column(name = "familia", nullable = true, length = 11)
    public String familia;

    @Column(name = "nom", nullable = true, length = 20)
    public String nom;

    @Column(name = "cognom1", nullable = true, length = 50)
    public String cognom1;

    @Column(name = "cognom2", nullable = true, length = 50)
    public String cognom2;

    @Column(name = "email", nullable = true, length = 50)
    public String email;

    @Column(name = "telefon1", nullable = true, length = 50)
    public String telefon1;

    @Column(name = "telefon2", nullable = true, length = 11)
    public String telefon2;

    @Column(name = "nacionalitat", nullable = true, length = 20)
    public String nacionalitat;

    @Column(name = "anyNaixement", nullable = true)
    public Integer anyNaixement;

    @Column(name = "esFill", nullable = false)
    public boolean esFill;


}
