public class Condicionais {

    /*
     * A Estrutura Condicional possibilita a escolha de um grupo de ações e comportamentos
     * a serem executados quando determinadas condições são ou não satisfeitas. A Estrutura
     * Condicional pode ser SIMPLES ou COMPOSTA.
     */

     public static void main(String[] args) {

        System.out.println("****************************** CONDICIONAIS SIMPLES ***************************************************");
        
        //Condicionais Simples: ocorre quando há uma execução de fluxo quando a condição for positiva

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println("Seu novo saldo é: " + saldo);
        }
        System.out.println("****************************** CONDICIONAIS COMPOSTAS ***************************************************");
         
        //Condicionais Compostas ocorrem quando o programa segue mais de uma jornada de execução condicionado a uma regra de negócio

        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }   

        System.out.println("****************************** CONDICIONAIS ENCADEADAS ***************************************************");
         
        //Condicionais Encadeadas existem pois nem sempre nos limitamos ao SE (if) e senão (ELSE), podemos ter uma terceira, quarta e ou inúmeras condições.

        nota = 15;

       if (nota >= 7 && nota <= 10) {
            System.out.println("Aprovado!");
       } else if (nota >= 6 && nota <= 7) {
            System.out.println("Recuperação!");
       } else if (nota > 0 && nota < 6) {
        System.out.println("Reprovado!");
       } else {
        System.out.println("Somente é possível validar uma nota de 0 a 10");
       }

       System.out.println("****************************** CONDIÇÃO TERNÁRIAS ***************************************************");

       //Como vimos em operadores, podemos abreviar nosso algoritmo condicional refatorando com o conceito de operador ternário.

       nota = 2;

       String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

       System.out.println(resultado);

     }
        
       
}
