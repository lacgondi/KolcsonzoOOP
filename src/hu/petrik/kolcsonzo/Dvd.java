package hu.petrik.kolcsonzo;

public class Dvd implements Kolcsonozheto, Comparable<Dvd>{
    private String cim;
    private int hossz;

    public Dvd(String cim, int hossz) {
        this.cim = cim;
        this.hossz = hossz;
    }

    @Override
    public String megjelenitendoNev() {
        return String.format("%s (%d perc)", this.cim, this.hossz);
    }

    @Override
    public int meddigKolcsonozoheto() {
        return 7;
    }

    @Override
    public int compareTo(Dvd masikDvd) {
        return this.hossz - masikDvd.hossz;
    }
}
