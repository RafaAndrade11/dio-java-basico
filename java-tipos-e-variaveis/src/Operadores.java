public class Operadores {
    public static void main(String[] args) {
         //Operadores são símbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas operações. 

         //OPERADORES DE ATRIBUIÇÃO SÃO UTILIZADOS PARA DEFINIR O VALOR INICIAL OU SOBRESCREVER O VALOR DE UMA VARIÁVEL
         String nome = "Rafael"; //o operador '=' atribui o valor "Rafael" a variável nome
         System.out.println("O nome é: " + nome);

         System.out.println("******************************************************************");

         /*
          * OPERADORES ARITMÉTICOS SÃO UTILIZADOS PARA REALIZAR OPERAÇÕES MATEMÁTICAS ENTRE VALORES NUMÉRICOS, PODENDO SE TORNAR OU NÃO UMA EXPRESSÃO MAIS COMPLEXA
          * SÃO ELES: + (adição), - (subtração), * (multiplicação) e / (divisão)
          * Seguem exemplos de cada um a seguir:
          */
          
          double soma = 10.3 + 23.2;
          int subtracao = 131 - 23;
          int multiplicacao = 23 * 12;
          int divisao = 10 / 2; 

          System.out.println("Resultado da soma : " + soma);
          System.out.println("Resultado da subtracao : " + subtracao);
          System.out.println("Resultado da multiplicacao : " + multiplicacao);
          System.out.println("Resultado da divisao : " + divisao);

          String somaPalavras = "Juntar" + "Palavras";
          System.out.println("O operador + também pode juntar palavras ao ser utilizado por texto, veja: " + somaPalavras);
    }
}
