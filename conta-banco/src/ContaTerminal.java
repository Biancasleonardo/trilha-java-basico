import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Didite o número da sua conta: ");
       int accountNumber = sc.nextInt();

       System.out.println("Didite sua agência bancaria: ");
       String agencyNumber = sc.next();

       System.out.println("Digite seu nome completo: ");
       String Name = sc.next();

       System.out.println("Digite seu saldo: ");
       double balance = sc.nextDouble();

       System.out.println("Olá " + Name + ", obrigado por criar uma conta em nosso banco, sua agência é : " + agencyNumber + ", conta: " + accountNumber + " e seu saldo " + balance + " já está disponível para saque!");

       sc.close();
    }
}
