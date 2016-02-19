package models;

import play.db.jpa.GenericModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Socis socis = (Socis) o;

        if (id != socis.id) return false;
        if (actiu != socis.actiu) return false;
        if (nom != null ? !nom.equals(socis.nom) : socis.nom != null) return false;
        if (tipusSoci != null ? !tipusSoci.equals(socis.tipusSoci) : socis.tipusSoci != null) return false;
        if (adressa != null ? !adressa.equals(socis.adressa) : socis.adressa != null) return false;
        if (codiPostal != null ? !codiPostal.equals(socis.codiPostal) : socis.codiPostal != null) return false;
        if (poblacio != null ? !poblacio.equals(socis.poblacio) : socis.poblacio != null) return false;
        if (circular != null ? !circular.equals(socis.circular) : socis.circular != null) return false;
        if (butlleti != null ? !butlleti.equals(socis.butlleti) : socis.butlleti != null) return false;
        if (conegut != null ? !conegut.equals(socis.conegut) : socis.conegut != null) return false;
        if (comentaris != null ? !comentaris.equals(socis.comentaris) : socis.comentaris != null) return false;
        if (familia != null ? !familia.equals(socis.familia) : socis.familia != null) return false;
        if (dataAlta != null ? !dataAlta.equals(socis.dataAlta) : socis.dataAlta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (tipusSoci != null ? tipusSoci.hashCode() : 0);
        result = 31 * result + (adressa != null ? adressa.hashCode() : 0);
        result = 31 * result + (codiPostal != null ? codiPostal.hashCode() : 0);
        result = 31 * result + (poblacio != null ? poblacio.hashCode() : 0);
        result = 31 * result + (circular != null ? circular.hashCode() : 0);
        result = 31 * result + (butlleti != null ? butlleti.hashCode() : 0);
        result = 31 * result + (conegut != null ? conegut.hashCode() : 0);
        result = 31 * result + (comentaris != null ? comentaris.hashCode() : 0);
        result = 31 * result + (familia != null ? familia.hashCode() : 0);
        result = 31 * result + (dataAlta != null ? dataAlta.hashCode() : 0);
        return result;
    }
}
