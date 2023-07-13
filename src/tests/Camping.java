/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import entities.campingg;
import service.serviceCamping;
import utils.MyDb;
import java.sql.Date;
import service.CrudCentre;
/**
 *
 * @author LENEVO
 */
public class Camping {
//ra9amt bel ghalet 3asab
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      campingg c = new campingg(5,"saber","slug","des",Date.valueOf("2022-02-22"),Date.valueOf("2022-02-22"),"pho",5,555,1);
                   serviceCamping sc1 = new serviceCamping();
      sc1.ajouter(c);
      sc1.modifier(c);
      
       // System.out.println(sc1.listJointure());
       // sc1.supprimer(new campingg(4) );
        CrudCentre cr = new CrudCentre();
        System.out.println(cr.afficher());
       
       
    }
    
}
