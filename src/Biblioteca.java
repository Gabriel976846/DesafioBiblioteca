import java.util.ArrayList;
import java.util.List;

public class Biblioteca <T>{
    private List<T> livrosarmazenados = new ArrayList<>();

    public List<T> getLivrosarmazenados() {
        return livrosarmazenados;
    }

    public void setLivrosarmazenados(List<T> livrosarmazenados) {
        this.livrosarmazenados = livrosarmazenados;
    }

}
