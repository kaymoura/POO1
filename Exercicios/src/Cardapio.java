import java.util.Locale;
import java.util.Scanner;
/**
 * @author Kaylane Coelho de Moura
 */
public class Cardapio {
    public static void main(String[] args) {
        Locale locale = Locale.of("pt-BR");

        //Instanciar objeto "teclado" do tipo Scanner
        Scanner k = new Scanner(System.in);

        // Declaracao de variaveis
        int codigo, qtd;
        float r;
        String dqtd = "Digite a quantidade:";

        System.out.println("Seja Bem-vindo(a)!");
        System.out.println("\n Cardapio do dia:\n");
        System.out.println("Código\t| Descrição\t\t\t\t| Preço");
        System.out.println("1\t\t Cachorro quente\t\t R$ 8,00\n" +
                "2\t\t X-Salada\t\t\t\t R$ 18,00\n" +
                "3\t\t X-Bacon\t\t\t\t R$ 16,00\n" +
                "4\t\t Torrada Simples\t\t R$ 4,00\n" +
                "5\t\t Refrigerante\t\t\t R$ 5,00");

        System.out.println("\nDigite o codigo do produto que deseja:");
        codigo = k.nextInt();

        if (codigo == 1) {
            System.out.println(dqtd);
            qtd = k.nextInt();
            r = qtd * 8;
            System.out.printf("Seu pedido tem valor total de R$ %.2f", r);
        } else if (codigo == 2) {
            System.out.println(dqtd);
            qtd = k.nextInt();
            r = qtd * 18;
            System.out.printf("Seu pedido tem valor total de R$ %.2f", r);
        } else if (codigo == 3) {
            System.out.println(dqtd);
            qtd = k.nextInt();
            r = qtd * 16;
            System.out.printf("Seu pedido tem valor total de R$ %.2f", r);
        } else if (codigo == 4) {
            System.out.println(dqtd);
            qtd = k.nextInt();
            r = qtd * 4;
            System.out.printf("Seu pedido tem valor total de R$ %.2f", r);
        } else if (codigo == 5) {
            System.out.println(dqtd);
            qtd = k.nextInt();
            r = qtd * 5;
            System.out.printf("Seu pedido tem valor total de R$ %.2f", r);
        } else {
            System.out.println("Codigo inválido.");
        }   k.close();
    }
}
