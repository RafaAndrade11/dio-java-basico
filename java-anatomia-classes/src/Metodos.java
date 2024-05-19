public class Metodos {
    public static void main(String[] args) {

        //Começamos declarando nosso primeiro nome e nosso segundo nome, mas como iremos unir?
        
        String primeiroNome = "Rafael";

        String segundoNome = "Andrade";

        System.out.println("Unindo os nomes de forma manual = " + primeiroNome + " " + segundoNome);
        //podemos simplesmente unir as duas Strings, porém não seria algo muito prático e deixaria o código muito extenso. Para isso, utilizaremos o método nomeCompleto. 

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
       
    }
   
    //Um método pode receber parâmetros de tipos diferentes e a resposta também pode ser do mesmo tipo ou tipos diferentes
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado utilizando método = " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
