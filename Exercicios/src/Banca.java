import java.util.Locale;
import java.util.Scanner;
/**
 * @author Kaylane Coelho de Moura
 */
public class Banca {
    public static void main(String[] args) {
        Locale locale = Locale.of("pt-BR");

        //Instanciar objeto "teclado" do tipo Scanner
        Scanner k = new Scanner(System.in);

        // Declaracao de variaveis
        char cod;

        System.out.println("Seja Bem-vindo(a) a Banca!\nTemos as seguintes opções:");
        System.out.println("A\t Jornal\n" +
                "B\t Revista\n" +
                "C\t Manga\n" +
                "D\t Revista de Moda\n" +
                "E\t Revista Negocios");
        System.out.println("Insira sua escolha:");
        cod = k.next().charAt(0);
        System.out.print("Você escolheu ");
        switch (cod){
            case 'A':
                System.out.print("Jornal."); break;
            case 'B':
                System.out.print("Revista."); break;
            case 'C':
                System.out.print("Manga."); break;
            case 'D':
                System.out.print("Revista de Moda."); break;
            case 'E':
                System.out.print("Revista Negocios."); break;
            default:
                System.out.println("uma opção invalida."); break;
        } k.close();
    }
}
