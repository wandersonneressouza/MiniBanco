import java.util.Scanner;

public class MiniBanco{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
         
        System.out.println("MiniBanco iniciado");

        //variaveis principal da conta;
        double  saldo   = 0.0;
        int     opcao   = -1;

        //boas vindas

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.printf("Ola, %s! Saldo inicial: R$ %.2f\n", nome,saldo);

    
    }

}