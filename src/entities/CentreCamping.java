/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author LENEVO
 */
public class CentreCamping {
    
    private int id;
    private String nom;
    private String description ;
    
    private String adersse;

    public CentreCamping(int id, String nom, String description, String photo, String adersse) {
        this.id = id;
        this.nom = nom;
        this.description = description;
       
        this.adersse = adersse;
    }

   
    public CentreCamping(int id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }

   

    public CentreCamping() {
    }

    public CentreCamping(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getAdersse() {
        return adersse;
    }

    public void setAdersse(String adersse) {
        this.adersse = adersse;
    }

    @Override
    public String toString() {
        return "CentreCamping{" + "id=" + id + ", nom=" + nom + ", description=" + description +  ", adersse=" + adersse + '}';
    }

    
    
}
