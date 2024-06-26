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

        System.out.println("******************************************************************");

        /*
        * OPERADORES UNÁRIOS SÃO APLICADOS JUNTAMENTE COM UM OUTRO OPERADOR ARITMÉTICO. ELES REALIZAM ALGUNS TRABALHOS BÁSICOS COMO INCREMENTAR, DECREMENTAR, INVERTER
        * VALORES NUMÉRICOS E BOOLEANOS
        * (+) Operador unário de valor positivo 
        * (-) Operador unário de valor negativo
        * (++) Operador unário de incremento de valor
        * (--) Operador unário de decremento de valor
        * (!) Operador unário lógico de negação
        */

        int numero = 5;

        numero = - numero;
        System.out.println("Utilizando o operador unário (-) = " + numero); 

        numero = + numero; 
        System.out.println("Utilizando o operador unário (+) = " + numero); 
        //percebe-se que o valor não mudou, pois é uma operação aritmética, para o número virar +5 deve-se multiplicar a variável por -1

        numero = 5;
        numero++;
           
        System.out.println("Utilizando o operador unário (++) = " + numero); 

        numero--;
        System.out.println("Utilizando o operador unário (--) = " + numero); 

        boolean variavel = true;
        System.out.println("Este é um exemplo utilizando o operador unário (!): " + !variavel); //este valor ficará em memória, nosso valor original ainda será "true"

        System.out.println("******************************************************************");

        /*
         * OPERADORES DE CONDIÇÃO TERNÁRIA É UMA FORMA RESUMIDA PARA DEFINIR UMA CONDIÇÃO E ESCOLHER POR UM DENTRE DOIS VALORES. VOCÊ DEVE PENSAR NUMA CONDIÇÃO TERNÁRIA
         * COMO SE FOSSE UMA CONFIÇÃO IF NORMAL, PORÉM, DE UMA FORMA EM QUE TODA A SUA ESTRUTURA ESTARÁ ESCRITA NUMA ÚNICA LINHA.
         * O OPERADOR TERNÁRIO É REPRESENTADO PELOS SÍMBOLOS (?). 
         * SINTAXE: <Expressão condicional> ? <Caso condição seja true> : <Caso condição seja false>
         * 
         * Veja a seguir:
         */

        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        System.out.println("******************************************************************");

        /*
         * OPERADORES RELACIONAIS AVALIAM A RELAÇÃO ENTRE DUAS VARIÁVEIS OU EXPRESSÕES. NESSE CASO, DEFINEM SE O OPERANDO À ESQUERA É IGUAL, DIFERENTE, MENOR, MENOR OU IGUAL, MAIOR
         * OU MAIOR OU IGUAL AO DA DIREITA, RETORNANDO UM VALOR BOOLEANO COMO RESULTADO.
         * 
         * (==) Quando desejamos verificar se uma variável é IGUAL A outra
         * (!=) Quando desejamos verificar se uma variável é DIFERENTE da outra
         * (>) Quando desejamos verificar se uma variável é MAIOR QUE a outra
         * (>=) Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra
         * (<) Quando desejamos verificar se uma variável é MENOR QUE a outra
         * (<=) Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra
         */

         int numero1 = 1;
         int numero2 = 2;

         boolean simNAO = numero1 == numero2;

         System.out.println("numero1 é igual a numero2? " + simNAO);

         if (numero1 != numero2) {
            System.out.println("Nossa condição é verdadeira, o numero1 é diferente do numero2");
         }

         String nomeUm = "Rafael";
         String nomeDois = new String("Rafael");

         System.out.println(nomeUm==nomeDois); //não é possível comparar com operador relacional, pois foi criado outro objeto
         System.out.println(nomeUm.equals(nomeDois)); //nesse caso podemos comparar uma String dessa forma
         
         System.out.println("******************************************************************");

         /*
          * OS OPERADORES LÓGICOS REPRESENTAM O RECURSO QUE NOS PERMITE CRIAR EXPRESSÕES LÓGICAS MAIORES A PARTIR DA JUNÇÃO DE DUAS OU MAIS EXPRESSÕES
          * (&&) Operador lógico 'E'
          * (||) Operador lógico 'OU'
          */

          boolean condicao1 = true;
          boolean condicao2 = true;

          if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
          }

          if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
          }

          System.out.println("FIM");
    }
}
