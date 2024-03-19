import java.util.Locale;
import java.util.Scanner;
/**
 * @author Kaylane Coelho de Moura
 */
public class BancoShabaray {
    public static void main(String[] args) {
        Locale locale = Locale.of("pt-BR");

        //Instanciar objeto "teclado" do tipo Scanner
        Scanner k = new Scanner(System.in);

        System.out.println("Banco Shabaray!\nSeja Bem-vindo(a), escolha uma opção:");
        System.out.println("-\t Consultar Saldo\n" +
                "-\t Depositar\n" +
                "-\t Sacar\n" +
                "-\t Transferir\n" +
                "-\t Sair");
        System.out.println("Insira sua escolha:");
        String escolha = k.nextLine().toLowerCase();
        System.out.print("Você selecionou ");
        switch (escolha){
            case "consultar saldo":
                System.out.println("consultar o saldo");
                System.out.print("Seu saldo é de R$7.000,00"); break;
            case "depositar":
                System.out.println("depositar");
                System.out.print("Quanto deseja depositar?");
                double dep = k.nextDouble();
                System.out.printf("R$ %.2f foi depositado!", dep); break;
            case "sacar":
                System.out.println("sacar");
                System.out.print("Quanto deseja sacar?.");
                double sac = k.nextDouble();
                System.out.printf("R$ %.2f pronto para sacar!", sac); break;
            case "transferir":
                System.out.println("transferir");
                System.out.print("Quanto deseja transferir?.");
                double tr = k.nextDouble();
                System.out.printf("R$ %.2f pronto para transferir!", tr); break;
            case "sair":
                System.out.println("sair.");
                System.out.print("Obrigada! Volte sempre!"); break;
            default:
                System.out.println("uma opção invalida."); break;
        } k.close();
    }
}
