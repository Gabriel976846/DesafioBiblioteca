import java.time.LocalDate;

public class Clientes {
    private int id;
    private String nome;
    private LocalDate datanascimento;
    private float dividas;
    private boolean autorizacaoparaemprestar;

    public Clientes(int id, String nome, LocalDate datanascimento, float dividas, boolean autorizacaoparaemprestar) {
        this.id = id;
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.dividas = dividas;
        this.autorizacaoparaemprestar = (dividas>0)?true:false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    public float getDividas() {
        return dividas;
    }

    public void setDividas(float dividas) {
        this.dividas = dividas;
    }

    public boolean isAutorizacaoparaemprestar() {
        return autorizacaoparaemprestar;
    }

    public void setAutorizacaoparaemprestar(boolean autorizacaoparaemprestar) {
        this.autorizacaoparaemprestar = autorizacaoparaemprestar;
    }

    @Override
    public String toString() {
        return getId() + ";" + getNome() + ";" + isAutorizacaoparaemprestar();
    }
}
