
package entities;

import java.sql.Date;
import java.time.LocalDateTime;
/**
 * 
 * @author TOSHIBA
 */
public class Randonnee {
    
private int id_Rando;
private String intitule_Rando;          
private Date DateRando;
private String description_Rando;
private int tarif_Rando;
private String photo_Rando;
private int nbplace_Rando;
private String lieu_Visitè;

    public Randonnee() {
    }

    public Randonnee(int id_Rando) {
        this.id_Rando = id_Rando;
    }

    public Randonnee(String lieu_Visitè) {
        this.lieu_Visitè = lieu_Visitè;
    }

    public Randonnee(int id_Rando, String intitule_Rando, Date DateRando, String description_Rando, int tarif_Rando, String photo_Rando, int nbplace_Rando, String lieu_Visitè) {
        this.id_Rando = id_Rando;
        this.intitule_Rando = intitule_Rando;
        this.DateRando = DateRando;
        this.description_Rando = description_Rando;
        this.tarif_Rando = tarif_Rando;
        this.photo_Rando = photo_Rando;
        this.nbplace_Rando = nbplace_Rando;
        this.lieu_Visitè = lieu_Visitè;
    }

    public Randonnee(String intitule_Rando, Date DateRando, String description_Rando, int tarif_Rando, String photo_Rando, int nbplace_Rando, String lieu_Visitè) {
        this.intitule_Rando = intitule_Rando;
        this.DateRando = DateRando;
        this.description_Rando = description_Rando;
        this.tarif_Rando = tarif_Rando;
        this.photo_Rando = photo_Rando;
        this.nbplace_Rando = nbplace_Rando;
        this.lieu_Visitè = lieu_Visitè;
    }
     
    public int getId_Rando() {
        return id_Rando;
    }

    public void setId_Rando(int id_Rando) {
        this.id_Rando = id_Rando;
    }

    public String getIntitule_Rando() {
        return intitule_Rando;
    }

    public void setIntitule_Rando(String intitule_Rando) {
        this.intitule_Rando = intitule_Rando;
    }

    public Date getDateRando() {
        return DateRando;
    }

    public void setDateRando(Date DateRando) {
        this.DateRando = DateRando;
    }

    public String getDescription_Rando() {
        return description_Rando;
    }

    public void setDescription_Rando(String description_Rando) {
        this.description_Rando = description_Rando;
    }

    public int getTarif_Rando() {
        return tarif_Rando;
    }

    public void setTarif_Rando(int tarif_Rando) {
        this.tarif_Rando = tarif_Rando;
    }

    public String getPhoto_Rando() {
        return photo_Rando;
    }

    public void setPhoto_Rando(String photo_Rando) {
        this.photo_Rando = photo_Rando;
    }

    public int getNbplace_Rando() {
        return nbplace_Rando;
    }

    public void setNbplace_Rando(int nbplace_Rando) {
        this.nbplace_Rando = nbplace_Rando;
    }

    public String getLieu_Visitè() {
        return lieu_Visitè;
    }

    public void setLieu_Visitè(String lieu_Visitè) {
        this.lieu_Visitè = lieu_Visitè;
    }

    @Override
    public String toString() {
        return "Randonnee{" + "id_Rando=" + id_Rando + ", intitule_Rando=" + intitule_Rando + ", DateRando=" + DateRando + ", description_Rando=" + description_Rando + ", tarif_Rando=" + tarif_Rando + ", photo_Rando=" + photo_Rando + ", nbplace_Rando=" + nbplace_Rando + ", lieu_Visitè=" + lieu_Visitè + '}';
    }

    

      
}

