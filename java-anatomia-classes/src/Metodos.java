public class Metodos {
    public static void main(String[] args) {
        
        String primeiroNome = "Rafael";

        String segundoNome = "Andrade";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
       
    }
   
    //*Um método pode receber parâmetros de tipos diferentes e a resposta também pode ser do mesmo tipo ou tipos diferentes */
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
