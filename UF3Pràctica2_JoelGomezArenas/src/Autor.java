
import java.util.List;

public class Autor {

    private String nom;

    private String nacionalitat;

    private String data_naixement;

    private List<Llibre> llibreEscrits;

    public Autor(String nom, String nacionalitat, String data_naixement, List<Llibre> llibreEscrits) {
        this.nom = nom;
        this.nacionalitat = nacionalitat;
        this.data_naixement = data_naixement;
        this.llibreEscrits = llibreEscrits;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public String getData_naixement() {
        return data_naixement;
    }

    public void setData_naixement(String data_naixement) {
        this.data_naixement = data_naixement;
    }

    public List<Llibre> getLlibreEscrits() {
        return llibreEscrits;
    }

    public void setLlibreEscrits(List<Llibre> llibreEscrits) {
        this.llibreEscrits = llibreEscrits;
    }
    
    
}
