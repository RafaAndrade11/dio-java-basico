public class App {
    public static void main(String[] args) {
        SmartTV tv1 = new SmartTV();

        System.out.println("A TV está ligada? " + tv1.isLigada);
        tv1.ligar();
        System.out.println("A TV está ligada? " + tv1.isLigada);
        tv1.ligar();
        tv1.desligar();
        System.out.println("A TV está ligada? " + tv1.isLigada);

        
    }
}
