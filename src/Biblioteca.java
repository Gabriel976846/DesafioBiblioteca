import java.util.Scanner;

public class Biblioteca {
    Scanner entradadeinformacoes = new Scanner(System.in);

    // FUNÇÃO DE LISTAR LIVROS - FILTRAGE POR STREAMS
    public void ListarLivros(){
        if (Livros.getLivroscadastrados().isEmpty()){
            System.out.println("Não temos Livros disponiveis");

        } else {
            System.out.println("Escolha a ordem de filtragem.");
            System.out.println("1 - Genero");
            System.out.println("2 - Disponibilidade");
            System.out.println("3 - Por nome");
            System.out.print("Escolha: ");
            int decisao = entradadeinformacoes.nextInt();

            switch (decisao){
                case 1:

                    break;
            }
        }
    }
}
