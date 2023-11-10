import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do terminal
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua Agencia:");
        String agencia = scanner.nextLine();

        System.out.print("Digite seu número de conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer após a leitura do número inteiro

        System.out.print("Qual seu nome?");
        String nomeCliente = scanner.nextLine();

        Random random = new Random();
        double saldo = random.nextDouble() * 50001; // Corrigir o uso do método nextDouble
        saldo = Double.parseDouble(new DecimalFormat("0.00").format(saldo)); // Limitar a duas casas decimais

        // Exibe os dados inseridos
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia +
            ", número da conta é " + numero +", e seu saldo é R$" + saldo + ". Saldo já está disponível para saque.");

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
