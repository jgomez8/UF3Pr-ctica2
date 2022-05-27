
import java.util.ArrayList;
import java.util.List;

public class Lector {

    private List<LlibreCopia> llibresAdquirits;

    private final int MAXIM_LLIBRES = 3;

    public Lector(List<LlibreCopia> llibresAdquirits) {
        llibresAdquirits = new ArrayList();
    }

    public List<LlibreCopia> getLlibresAdquirits() {
        return llibresAdquirits;
    }

    public int getMAXIM_LLIBRES() {
        return MAXIM_LLIBRES;
    }

    public void setLlibresAdquirits(LlibreCopia llibre) {
        if(llibresAdquirits.size() < MAXIM_LLIBRES){
            llibresAdquirits.add(llibre);
            System.out.println("Llibre adquirit!");
        }
    }
    

    
    
    
    
    
}
