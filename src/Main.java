import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradadedados = new Scanner(System.in);
        Biblioteca objetocentraldefuncoes = new Biblioteca();

        while (true) {
            System.out.println("===== Biblioteca =====");
            System.out.println("Escolha uma das opções");
            System.out.println("1 - Livros");
            System.out.println("2 - Clientes");
            System.out.println("3 - Impressão");
            System.out.print("Escolha: ");
            int escolha = entradadedados.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Escolha o que deseja fazer");
                    System.out.println("1 - Ver livros disponiveis");
                    System.out.println("2 - Emprestar um livro");
                    System.out.println("3 - Devolver um livro");
                    System.out.println("4 - Doar Livro");
                    System.out.print("Escolha: ");
                    int escolhacaso1livros = entradadedados.nextInt();

                    switch (escolhacaso1livros) {
                        case 1:
                            objetocentraldefuncoes.ListarLivros();
                            break;
                    }
                break;
                case 4:
                    System.out.println("Saindo da biblioteca");
                break;
                default:
                    System.out.println("Escolha não encontrada. Tente novamente");
                    break;
            }
            if (escolha == 4){
                entradadedados.close();
                break;

            }
        }
    }
}