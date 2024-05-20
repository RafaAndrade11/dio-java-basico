public class AprendendoADebugar {
    public static void main(String[] args) {
        System.out.println("Iniciando o processo de Debugging");
        a();
        System.out.println("Fim do processo de Debugging");
    }

    private static void a() {
        System.out.println("Iniciando o método a()...");
        b();
    }

    private static void b() {
        System.out.println("Iniciando o médoto b()...");
        c();   
    }

    private static void c() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        } 
    }
}
