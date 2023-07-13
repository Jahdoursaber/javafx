
package entities;

import java.sql.Date;



public class ReservationRando {
    private int id_Res;
    public User user;
    public Randonnee randonnee;
    private Date date_Reserv;
   

    public ReservationRando() {
    }
    
    public ReservationRando(int id_Res) {
        this.id_Res = id_Res;
    }

    public ReservationRando(User user, Randonnee randonnee) {
        this.user = user;
        this.randonnee = randonnee;
    }

    public ReservationRando(Randonnee randonnee) {
        this.randonnee = randonnee;
    }

    public ReservationRando(int id_Res, User user, Randonnee randonnee) {
        this.id_Res = id_Res;
        this.user = user;
        this.randonnee = randonnee;
    }

    
    public ReservationRando(int id_Res, User user, Randonnee randonnee, Date date_Reserv) {
        this.id_Res = id_Res;
        this.user = user;
        this.randonnee = randonnee;
        this.date_Reserv = date_Reserv;
    }

    public ReservationRando(User user, Randonnee randonnee, Date date_Reserv) {
        this.user = user;
        this.randonnee = randonnee;
        this.date_Reserv = date_Reserv;
    }
    
    

//    public ReservationRando(int id_Res, User user, Randonnee randonnee, String date_Reserv) {
//        this.id_Res = id_Res;
//        this.user = new User();
//        this.randonnee = new Randonnee();
//        this.date_Reserv = date_Reserv;
//    }

    public int getId_Res() {
        return id_Res;
    }

    public void setId_Res(int id_Res) {
        this.id_Res = id_Res;
    }

    public Date getDate_Reserv() {
        return date_Reserv;
    }

    public void setDate_Reserv(Date date_Reserv) {
        this.date_Reserv = date_Reserv;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Randonnee getRandonnee() {
        return randonnee;
    }

    public void setRandonnee(Randonnee randonnee) {
        this.randonnee = randonnee;
    }
    
    @Override
    public String toString() {
        return "ReservationRando{" + "id_Res=" + id_Res + ", user=" + user + ", randonnee=" + randonnee + ", date_Reserv=" + date_Reserv +'}';
    }

    
}