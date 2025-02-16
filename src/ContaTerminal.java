import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        double saldo = 237.48;

        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Conta número: " + numero);
        System.out.println("Seu saldo de " + saldo + ", já está disponível");
    }
}

