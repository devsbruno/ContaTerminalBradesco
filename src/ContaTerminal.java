import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar as variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitar e receber os dados do usuário
        
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.next();
        
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        scanner.nextLine(); // Consumir a nova linha
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        String saldoStr = scanner.next();
        saldo = Double.parseDouble(saldoStr.replace(",", "."));

        // Exibir a mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
