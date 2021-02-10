package microservice.clientui.demo;

import java.util.List;

public class Client {

    public int id;
    public String nom;
    public List<Object> panier;

    public Client() {
    }

    public Client(int id, String nom) {
        this.id = id;
        this.nom = nom;
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

    public List<Object> getPanier() {
        return panier;
    }

    public void setPanier(List<Object> panier) {
        this.panier = panier;
    }
}
