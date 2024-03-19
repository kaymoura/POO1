import java.util.Locale;
import java.util.Scanner;
/**
 * @author Kaylane Coelho de Moura
 */
public class MaquinaSD {
    public static void main(String[] args) {
        Locale locale = Locale.of("pt-BR");

        //Instanciar objeto "teclado" do tipo Scanner
        Scanner k = new Scanner(System.in);

        // Declaracao de variaveis
        int cod;

        System.out.println("Seja Bem-vindo(a)!");
        System.out.println("Máquina de Salgados e Doces");
        System.out.println("1\t\t Chocolate\n" +
                "2\t\t Bala\n" +
                "3\t\t Refrigerante\n" +
                "4\t\t Agua\n" +
                "5\t\t Suco");
        System.out.println("Insira o numero de sua escolha:");
        cod = k.nextInt();
        System.out.print("Você escolheu ");
        switch (cod){
            case 1:
                System.out.print("Chocolate."); break;
            case 2:
                System.out.print("Bala."); break;
            case 3:
                System.out.print("Refrigerante."); break;
            case 4:
                System.out.print("Agua."); break;
            case 5:
                System.out.print("Suco."); break;
            default:
                System.out.println("uma opção invalida."); break;
        } k.close();
    }
}
