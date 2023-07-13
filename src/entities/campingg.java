/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;



/**
 *
 * @author LENEVO
 */
public class campingg {
    private int id;
    private String title;
    private String slug;
    private String description;
    private Date date_debut;
    private Date date_fin;
    private String photo ;
    private int nbr_place; 
    private double prix;
    private int  id_centre_camping;
    public int getCamping_id() {
        return id_centre_camping;
    }
    public void setCamping_id(int id_centre_camping) {
        this.id_centre_camping = id_centre_camping;
    }
   
    public campingg() {
    }

    public campingg(int id) {
        this.id = id;
    }

    public campingg(int id, String title, String slug, String description, Date date_debut, Date date_fin, String photo, int nbr_place, double prix, int id_centre_camping) {
        this.id = id;
        this.title = title;
        this.slug = slug;
        this.description = description;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.photo = photo;
        this.nbr_place = nbr_place;
        this.prix = prix;
        this.id_centre_camping = id_centre_camping;
    }

        public campingg(String title, String slug, String description, Date date_debut, Date date_fin, String photo, int nbr_place, double prix, int id_centre_camping) {
        this.title = title;
        this.slug = slug;
        this.description = description;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.photo = photo;
        this.nbr_place = nbr_place;
        this.prix = prix;
        this.id_centre_camping = id_centre_camping;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSlug() {
        return slug;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public String getPhoto() {
        return photo;
    }

    public int getNbr_place() {
        return nbr_place;
    }

    public double getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setNbr_place(int nbr_place) {
        this.nbr_place = nbr_place;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "campingg{" + "id=" + id + ", title=" + title + ", slug=" + slug + ", description=" + description + ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", photo=" + photo + ", nbr_place=" + nbr_place + ", prix=" + prix + '}';
    }
    
}
