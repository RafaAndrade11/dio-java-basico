import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AprendendoTryCatch {

    public static void main(String[] args) {

        //solicitando dados do usuário
        try{
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scan.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scan.next();

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();

        //imprimindo dados do usuário
        
        System.out.println("Olá , me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " cm.");
        scan.close();
        }
        catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos.");
        }
    }

  
    
}

