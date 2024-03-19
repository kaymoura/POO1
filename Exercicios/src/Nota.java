import java.util.Locale;
import java.util.Scanner;
/**
 * @author Kaylane Coelho de Moura
 */
public class Nota {
    public static void main(String[] args) {
        Locale locale = Locale.of("pt-BR");

        //Instanciar objeto "teclado" do tipo Scanner
        Scanner k = new Scanner(System.in);

        // Declaracao de variaveis
        double media;

        System.out.println("Seja Bem-vindo(a)!");
        System.out.println("Insira a média do aluno:");
        media = k.nextDouble();

        if (media < 4) {
            System.out.println("Reprovado!");
        } else if (media < 5) {
            System.out.println("Recuperação.");
        } else if (media < 6) {
            System.out.println("Conselho");
        } else if (media <= 10){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Nota inválida.");
        }
        k.close();
    }
}
