package hu.petrik.kolcsonzo;

public class Ujsag implements Kolcsonozheto{
    private String cim;
    private int kiadasEv;
    private int kiadasHet;

    public Ujsag(String cim, int kiadasEv, int kiadasHet) {
        this.cim = cim;
        this.kiadasEv = kiadasEv;
        this.kiadasHet = kiadasHet;
    }

    @Override
    public String megjelenitendoNev() {
        return String.format("%S %d/%d.",this.cim,this.kiadasEv,this.kiadasHet);
    }

    @Override
    public int meddigKolcsonozoheto() {
        return 0;
    }
}
