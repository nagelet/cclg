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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persones persones = (Persones) o;

        if (id != persones.id) return false;
        if (esFill != persones.esFill) return false;
        if (familia != null ? !familia.equals(persones.familia) : persones.familia != null) return false;
        if (nom != null ? !nom.equals(persones.nom) : persones.nom != null) return false;
        if (cognom1 != null ? !cognom1.equals(persones.cognom1) : persones.cognom1 != null) return false;
        if (cognom2 != null ? !cognom2.equals(persones.cognom2) : persones.cognom2 != null) return false;
        if (email != null ? !email.equals(persones.email) : persones.email != null) return false;
        if (telefon1 != null ? !telefon1.equals(persones.telefon1) : persones.telefon1 != null) return false;
        if (telefon2 != null ? !telefon2.equals(persones.telefon2) : persones.telefon2 != null) return false;
        if (nacionalitat != null ? !nacionalitat.equals(persones.nacionalitat) : persones.nacionalitat != null)
            return false;
        if (anyNaixement != null ? !anyNaixement.equals(persones.anyNaixement) : persones.anyNaixement != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (familia != null ? familia.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (cognom1 != null ? cognom1.hashCode() : 0);
        result = 31 * result + (cognom2 != null ? cognom2.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (telefon1 != null ? telefon1.hashCode() : 0);
        result = 31 * result + (telefon2 != null ? telefon2.hashCode() : 0);
        result = 31 * result + (nacionalitat != null ? nacionalitat.hashCode() : 0);
        result = 31 * result + (anyNaixement != null ? anyNaixement.hashCode() : 0);
        return result;
    }
}
