

    /*
     * Uma das maiores características da linguagem Java é que desde suas primeiras versões tínhamos em nossas mãos uma documentação rica
     * e detalhada dos recursos da linguagem.
     * Podemos consultar a documentação da linguagem diretamente do site da Oracle.
     * 
     * Observaremos algumas tags a seguir.
     */

    /**
     * <h1> Calculadora </h1>
     * A Calculadora realiza  operações matemáticas entre números inteiros.
     * <p>
     * <b> Note: </b> Leia atentamente a documentação desta classe
     * para desfrutar dos recursos oferecidos pelo autor 
     * 
     * @author Gleyson Sampaio
     * @version 1.0
     * @since 01/01/2022
     */

    public class Calculadora {
        /**
         * Este método é utilizado para somar dois números inteiros
         * @param numeroUm este é o primeiro parâmetro do método
         * @param numeroDois este é o segundo parâmetro do método
         * @return int o resultado deste método é a soma de dois inteiros
         */
        public int somar (int numeroUm, int numeroDois) {
            return numeroUm + numeroDois;
        }
}
