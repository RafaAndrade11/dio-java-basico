import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = terminal.nextInt();

        try {

            contar(primeiroParametro, segundoParametro);

        } catch (Exception ParametrosInvalidosException) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");

        }

        terminal.close();

        
    }

    static void contar(int primeiroParametro, int segundoParametro ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException();
        }
		
		int contagem = segundoParametro - primeiroParametro;
		//realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("IMPRIMINDO NÚMERO " + i);
        }
	}

}
