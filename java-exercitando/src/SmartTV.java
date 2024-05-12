public class SmartTV {
    boolean isLigada = false;
    int canal = 1;
    int volume = 50;

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

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

    public void AumentarVolume() {
        if (volume == 100) {
            System.out.println("NÃO É POSSÍVEL AUMENTAR O VOLUME, JÁ ESTÁ NO MÁXIMO!");
        } else {
            volume = volume + 1;
        }
    }

    public void diminuirVolume() {
        if (volume == 0) {
            System.out.println("NÃO É POSSÍVEL DIMINUIR O VOLUME, JÁ ESTÁ NO MÍNIMO!");
        } else {
            volume = volume - 1;
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
