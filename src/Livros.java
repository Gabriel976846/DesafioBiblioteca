import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Livros {
    private int id;
    private String titulo;
    private String genero;
    private String autor;
    private Year ano;
    private int quantidade;
    private boolean disponibildade;

    private static List<Livros> livroscadastrados = new ArrayList<>();

    int contadorid = 0;
    public Livros(int id, String titulo, String genero, String autor, Year ano, int quantidade) {
        contadorid++;
        this.id = contadorid;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.ano = ano;
        this.quantidade = quantidade;
        this.disponibildade = quantidade > 0;
    }

    public static List<Livros> getLivroscadastrados() {
        return livroscadastrados;
    }

    public static void setLivroscadastrados(List<Livros> livroscadastrados) {
        Livros.livroscadastrados = livroscadastrados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Year getAno() {
        return ano;
    }

    public void setAno(Year ano) {
        this.ano = ano;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isDisponibildade() {
        return disponibildade;
    }

    public void setDisponibildade(boolean disponibildade) {
        this.disponibildade = disponibildade;
    }

    @Override
    public String toString() {
        return getTitulo() + ";" + getGenero() + ";" + getAutor() + ";" + getAno() + ";" + isDisponibildade();
    }
}
