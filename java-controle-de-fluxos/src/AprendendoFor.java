public class AprendendoFor {
    public static void main(String[] args) {
        /*
         * Laços de repetição, também conhecidos como laços de iteração ou simplesmente
         * loops, são comandos que permitem iteração
         * de código, ou seja, que comandos presentes no bloco sejam repetidos diversas
         * vezes.
         * 
         * O comando *for* ("para") permite que uma variável contadora seja testada e
         * incrementada a cada iteração, sendo
         * essas informações definidas na chamada do comando. O comando for recebe como
         * entrada uma variável contadora, a
         * condição e o valor que será incrementado.
         * 
         * for (bloco de inicialização; expressão booleana de validação; bloco de
         * atualização)
         */

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println(carneirinhos + " - Contando carneirinhos");
        }
        System.out.println("Joaozinho dormiu");

        String alunos[] = { "RAFAEL", "RENATO", "JOÃO", "GABRIEL" };

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno do indice " + i + " é o: " + alunos[i]);
        }

        // lembrando que em Java o índice inicial é o 0

        // conseguimos também fazer o for em arrays de uma forma mais abreviada, veja:

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

        /*
         * Para finalizar o aspecto de controle de repetição for, precisamos compreender
         * duas palavras usadas
         * na linguagem que tem iteração com esse contexto de repetição: break e
         * continue
         *
         * Break significa quebrar, parar, frear, interromper. E é isso que se faz
         * quando o Java encontra esse comando
         * pela frente. Continue, como o nome diz, ele 'continua' o laço. O comando
         * break interrompe o laço, já o
         * continue interrompe somente a iteração atual.
         */

         for (int numero = 1; numero <=5; numero++) {
            if (numero == 3)
            break;

            System.out.println(numero);
         }

         System.out.println("AGORA UTILIZANDO O *CONTINUE*, SOMENTE É ELIMINADO O NÚMERO 3");

         for (int numero = 1; numero <=5; numero++) {
            if (numero == 3)
            continue;

            System.out.println(numero);
         }

    }
}