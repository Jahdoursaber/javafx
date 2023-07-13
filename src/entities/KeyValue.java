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
public class KeyValue {

    private int id;
    private String title;
    private String slug;
    private String description;
    private Date date_debut;
    private Date date_fin;
    private String photo;
    private int nbr_place;
    private double prix;
    private int id_centre_camping;
    private String nom;
    private String adersse;

    public KeyValue() {
    }

    public KeyValue(int id, String title, String slug, String description, Date date_debut, Date date_fin, String photo, int nbr_place, double prix, int id_centre_camping, String nom, String adersse) {
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
        this.nom = nom;
        this.adersse = adersse;
    }

    public KeyValue(int id, String title, String slug, String description, Date date_debut, Date date_fin, String photo, int nbr_place, double prix, String nom, String adersse) {
        this.id = id;
        this.title = title;
        this.slug = slug;
        this.description = description;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.photo = photo;
        this.nbr_place = nbr_place;
        this.prix = prix;
        this.nom = nom;
        this.adersse = adersse;
    }

    public KeyValue(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getNbr_place() {
        return nbr_place;
    }

    public void setNbr_place(int nbr_place) {
        this.nbr_place = nbr_place;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getId_centre_camping() {
        return id_centre_camping;
    }

    public void setId_centre_camping(int id_centre_camping) {
        this.id_centre_camping = id_centre_camping;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdersse() {
        return adersse;
    }

    public void setAdersse(String adersse) {
        this.adersse = adersse;
    }

    @Override
    public String toString() {
        return "KeyValue{" + "id=" + id + ", title=" + title + ", slug=" + slug + ", description=" + description + ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", photo=" + photo + ", nbr_place=" + nbr_place + ", prix=" + prix +  ", nom=" + nom + ", adersse=" + adersse + '}';
    }

    
    
}
