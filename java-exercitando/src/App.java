public class App {
    public static void main(String[] args) {
        SmartTV tv1 = new SmartTV();

        System.out.println("A TV está ligada? " + tv1.isLigada);
        tv1.ligar();
        System.out.println("A TV está ligada? " + tv1.isLigada);
        tv1.ligar();
        tv1.desligar();
        System.out.println("A TV está ligada? " + tv1.isLigada);

        System.out.println(tv1.getVolume());
        tv1.AumentarVolume();
        tv1.AumentarVolume();
        System.out.println(tv1.getVolume());
        tv1.setVolume(100);
        tv1.AumentarVolume();
        System.out.println(tv1.getVolume());
        tv1.diminuirVolume();
        System.out.println(tv1.getVolume());

        System.out.println(tv1.getCanal());
        tv1.aumentarCanal();
        System.out.println(tv1.getCanal());
        tv1.diminuirCanal();
        System.out.println(tv1.getCanal());
        tv1.mudarCanal(23);
        System.out.println(tv1.getCanal());

    }
}
