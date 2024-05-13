import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        Double saldo;
        int agencia;
        int numero;

        System.out.println("BEM VINDO AO PROGRAMA DE CONTAS BANCÁRIAS!");

        System.out.println("Digite aqui seu nome: ");
        nome = scan.nextLine();

        System.out.println("Digite aqui sua agencia: ");
        agencia = scan.nextInt();

        System.out.println("Digite aqui sua conta: ");
        numero = scan.nextInt();

        System.out.println("Digite aqui seu saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
