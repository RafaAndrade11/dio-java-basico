public class SmartTV {
    boolean isLigada = false;
    int canal;
    int volume;
    
    public void ligar() {
        if (isLigada == false) {
            isLigada = true;
        } else {
            System.out.println("TV JÁ ESTÁ LIGADA!");
        }
    }

    public void desligar() {
        if (isLigada == true) {
            isLigada = false;
        } else {
            System.out.println("TV JÁ ESTÁ DESLIGADA!");
        }
    }

    



    public boolean isLigada() {
        return isLigada;
    }
    public void setLigada(boolean isLigada) {
        this.isLigada = isLigada;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    
}
