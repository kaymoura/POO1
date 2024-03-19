import java.util.Locale;
import java.util.Scanner;
/**
 * @author Kaylane Coelho de Moura
 */
public class NotaTernario {
    public static void main(String[] args) {
        Locale locale = Locale.of("pt-BR");

        //Instanciar objeto "teclado" do tipo Scanner
        Scanner k = new Scanner(System.in);

        // Declaracao de variaveis
        double media;

        System.out.println("Seja Bem-vindo(a)!");
        System.out.println("Insira a média do aluno:");
        media = k.nextDouble();
        String resposta = media < 4 ? "Reprovado" :
                          media < 5 ? "Recuperação" :
                          media < 6 ? "Conselho" :
                          media <= 10 ? "Aprovado!": "Nota inválida.";

        System.out.println(resposta); k.close();
    }
}
