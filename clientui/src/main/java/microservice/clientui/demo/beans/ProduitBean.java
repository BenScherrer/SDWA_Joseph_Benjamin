package microservice.clientui.demo.beans;

public class ProduitBean {
    private int id;
    private String designation;
    private double prix;

    public ProduitBean() {
    }

    public ProduitBean(int id, String designation, double prix) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "ProductBean{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                '}';
    }
}
