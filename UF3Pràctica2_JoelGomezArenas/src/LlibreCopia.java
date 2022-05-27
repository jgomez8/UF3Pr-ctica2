public class LlibreCopia extends Llibre {

    private String id;

    private String estat;

    public LlibreCopia(String id, String estat, String nom, String tipus, 
            String editorial, int any, String autor) {
        super(nom, tipus, editorial, any, autor);
        this.id = id;
        this.estat = estat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }



    
    
    
    
}
