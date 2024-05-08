public class TiposEVariaveis {
    public static void main(String[] args) throws Exception {
        /*Tipos primitivos:
         * int, byte, short, long, float, double, boolean e char.
         * Esses tipos não são considerados objetos, e portanto representam valores brutos. 
         * São armazenados diretamente na pilha de memória (Memory stack)
         * 
         * Quando criamos uma variável, devemos estar cientes da proposta e do limite mínimo e máximo que será atribuído para a variável.
         * <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
         */

         //Exemplos:

         int idade; //Tipo "int", nome "idade", nenhum valor atribuído
         int anoFabricacao = 2024; //Tipo "int", nome "anoFabricacao", com valor atribuído
         double salarioMinimo = 2400; //Tipo "double", nome "salarioMinimo", com valor atribuído


         //Algumas particularidades:

         int cep = 23912382; // Ao trabalhar com cep, o mais interessante seria utilizar o tipo String, pois existem CEP's que começam com zero
         long cpf = 41123029382l; //Para o mesmo vale para o CPF, e deve-se atentar também que o tipo long deve terminar a atribuição com o "l" ao final do valor.

         /* 
          * JAVA É FORTEMENTE TIPADO - VARIAVEIS X CONSTANTES
          * 
          * Variavel é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo.
          * Constantes são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada
          * final, seguida do tipo.
          * 
          */

          int numero = 5;
          numero = 10; //variavel alterada normalmente

          final double VALOR_DE_PI = 3.14;
          // VALOR_DE_PI = 12; -> NÃO É POSSÍVEL, POIS VALOR_DE_PI É UMA CONSTANTE.
 
    }
}
