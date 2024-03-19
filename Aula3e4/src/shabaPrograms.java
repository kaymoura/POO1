import java.util.Scanner;

public class shabaPrograms {
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro");
//        Scanner sc = new Scanner(System.in);
//        double numero;
//        numero = sc.nextInt();
//        numero = sc.nextDouble();
//        System.out.printf("Você digitou o número: %.2f%n", numero);

//        System.out.println("Digite uma letra");
//        Scanner sc = new Scanner(System.in);
//        char letra;
//        letra = sc.next().charAt(0);
//        System.out.println("Você digitou : " + letra);

//        System.out.println("Digite o numero da casa e seu nome completo");
//        Scanner sc = new Scanner(System.in);
//        int casa;
//        String palavra1, palavra2, palavra3;
//
//        casa = sc.nextInt();
////        ajuste erro /n
//                   sc.nextLine();
//        palavra1 = sc.nextLine();
//        palavra2 = sc.nextLine();
//        palavra3 = sc.nextLine();
//        System.out.println("DADOS DIGITADOS : ");
//        System.out.println(casa);
//        System.out.println(palavra1);
//        System.out.println(palavra2);
//        System.out.println(palavra3);

//        System.out.println("Equação de segundo grau em JAVA");
//        System.out.println("Digite o valor de a:");
//        Scanner sc = new Scanner(System.in);
//        double a, b, c;
//        a = sc.nextDouble();
//        System.out.println("Digite o valor de b:");
//        b = sc.nextDouble();
//        System.out.println("Digite o valor de c:");
//        c = sc.nextDouble();
//
//        double raiz_quadrada;
//        raiz_quadrada = Math.pow(b, 2) - 4 * a *c;
//        double x1, x2;
//        x1 = (-b + Math.sqrt(raiz_quadrada))/2 * a;
//        x2 = (-b - Math.sqrt(raiz_quadrada))/2 * a;
//        if (Double.isNaN(x1)) {
//            System.out.println("Não possui numeros reais");
//        } else {
//        System.out.println("x1 = " + x1);
//        System.out.println("x2 = " + x2);
//        }
//        sc.close();

        //digite um número para saber se é impar ou par

        System.out.println("Impar ou Par em JAVA");
        System.out.println("Digite um número para saber se é impar ou par");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if(a % 2 == 0 ){
            System.out.println("Número par!");
        } else {
            System.out.println("Número impar!");
        }

    }
}

//Math.sqrt(raiz_quadrada);
//Math.pow(x, y); 2^5
