import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da Conta: ");
        int digito = sc.nextInt();
        sc.nextLine(); // limpa o buffer

        System.out.print("Digite o dígito da Agência: ");
        String ag = sc.nextLine();

        System.out.print("Digite o Nome do Cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Digite o saldo da conta do cliente: ");
        double saldo = sc.nextDouble();

        // Exibe a mensagem personalizada
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência: "
                + ag + ", conta: " + digito + " e seu saldo R$ " + String.format("%.2f", saldo) + " já está disponível para saque.");

        sc.close();
    }
}
