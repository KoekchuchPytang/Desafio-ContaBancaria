import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, por favor digite os seus dados na sequência em que eles são solicitados.");
        
        System.out.println("Digite o número da sua conta:");
        int numConta = scanner.nextInt();

        System.out.println("Digite o número de sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome completo:");
        String clienteNome = scanner.next();

        System.out.println("Nos informe seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " +clienteNome+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numConta+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
