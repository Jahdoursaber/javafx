/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.KeyValue;
import entities.campingg;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import utils.MyDb;

/**
 *
 * @author LENEVO
 */
public class serviceCamping implements IserviceCamping<campingg> {

    private Connection cnx = MyDb.getInstance().getCnx();
    public static campingg campingg;
@Override
    public void ajouter(campingg t) {
        // utilisateur i= new utilisateur() ; id= i.getId() ; 
        try {
            String querry = "INSERT INTO Campingg(title, Slug, description, date_debut, date_fin, photo, nbr_place, prix, id_centre_camping) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(querry);
            pst.setString(1, t.getTitle());
            pst.setString(2, t.getSlug());
            pst.setString(3, t.getDescription());
            pst.setDate(4, t.getDate_debut());
            pst.setDate(5, t.getDate_fin());
            pst.setString(6, t.getPhoto());
            pst.setInt(7, t.getNbr_place());
            pst.setDouble(8, t.getPrix());
            pst.setInt(9, t.getCamping_id());
            pst.executeUpdate();
            System.out.println("service classe ajouter methode  ");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        }

    }

    @Override
    public void supprimer(campingg t) {
        try {
            String req = "DELETE FROM Campingg WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, t.getId());
            pst.executeUpdate();
            System.out.println("Campingg suprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void modifier(campingg t) {
   try {
            String req = "UPDATE Campingg SET title=?,Slug=?,description=?,date_debut=? , date_fin=? ,photo=?,nbr_place=?, prix=?,id_centre_camping=? WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(req);

            pst.setString(1, t.getTitle());
            pst.setString(2, t.getSlug());
            pst.setString(3, t.getDescription());
            pst.setDate(4, t.getDate_debut());
            pst.setDate(5, t.getDate_fin());
            pst.setString(6, t.getPhoto());
            pst.setInt(7, t.getNbr_place());
            pst.setDouble(8, t.getPrix());
            pst.setInt(9, t.getCamping_id());
            pst.setInt(10, t.getId());

            pst.executeUpdate();
            System.out.println("comping modifiée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
//ctrl+hhahaha

    @Override
    public List<campingg> afficher() {
        List<campingg> list = new ArrayList<>();

        try {
            String req = "SELECT * FROM Campingg";
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new campingg(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getString(7), rs.getInt(8), rs.getDouble(9), rs.getInt(10)));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }

    
    public List<KeyValue> listJointure() {
        List<KeyValue> list = new ArrayList<>();

        try {
            String req = "SELECT * FROM `campingg` as c , `centre_camping` as ce WHERE c.id_centre_camping=ce.id;";
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                
                list.add(new KeyValue(rs.getInt("id"),rs.getString("title"),rs.getString("Slug"),rs.getString("description"),rs.getDate("date_debut"),rs.getDate("date_fin"),rs.getString("photo"),rs.getInt("nbr_place"),rs.getDouble("prix"),rs.getString("nom"),rs.getString("description")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }
    
      public void modifieini(KeyValue t) {
   try {
            String req = "UPDATE Campingg SET title=?,Slug=?,description=?,date_debut=? , date_fin=? ,photo=?,nbr_place=?, prix=? WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(req);

            pst.setString(1, t.getTitle());
            pst.setString(2, t.getSlug());
            pst.setString(3, t.getDescription());
            pst.setDate(4, t.getDate_debut());
            pst.setDate(5, t.getDate_fin());
            pst.setString(6, t.getPhoto());
            pst.setInt(7, t.getNbr_place());
            pst.setDouble(8, t.getPrix());
          //  pst.setInt(9, t.getCamping_id());
            pst.setInt(9, t.getId());

            pst.executeUpdate();
            System.out.println("comping modifiée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
      public List<campingg> cherchere(String t) {
        List<campingg> list1 = new ArrayList<>();
        List<campingg> list2 = afficher();
        list1 = (list2.stream().filter(r -> r.getTitle().startsWith(t))
               .collect(Collectors.toList()));
        
        return list1;
   }

}
