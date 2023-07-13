/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.CentreCamping;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.MyDb;

/**
 *
 * @author LENEVO
 */
public class CrudCentre implements IserviceCamping<CentreCamping> {

    private Connection con = MyDb.getInstance().getCnx();

    @Override
    public void ajouter(CentreCamping e) {
        String req = "INSERT INTO `camping`.`centre_camping` (`id`, `nom`, `description`, `adresse`) values (NULL, '" + e.getNom()+ "','" + e.getDescription() + "','"  + "','" + e.getAdersse()+ "')";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(req);
        } catch (SQLException ex) {
            System.out.println("Erreur" + ex);
        }
    }

    @Override
    public void supprimer(CentreCamping t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifier(CentreCamping t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CentreCamping> afficher() {
        ArrayList<CentreCamping> centre = new ArrayList<>();
     String req ="SELECT * FROM centre_camping";
     try{
         
     Statement stm =con.createStatement();
         ResultSet rst = stm.executeQuery(req);
     
     while(rst.next()){
         CentreCamping e = new CentreCamping();
         e.setId(rst.getInt("id"));
         e.setNom(rst.getString("nom"));
         e.setDescription(rst.getString("description"));
         e.setAdersse(rst.getString("adresse"));
         centre.add(e);
         
     }
     
     }catch (SQLException ex){
         
         System.out.println(ex);
     }
       return centre;
    }

}
