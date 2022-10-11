package hu.petrik.kolcsonzo;

import java.util.List;

public class Main {
    static List<Kolcsonozheto> katalogus;

    public static void main(String[] args) {
        Konyv konyv1= new Konyv("Dune", "Frank Herbert", "AABBCC-112233");
        Dvd dvd1 = new Dvd("Interstellar", 169);
        Dvd dvd2 = new Dvd("Inception", 148);
        Ujsag ujsag1= new Ujsag("Képes sport", 2007, 23);

        katalogus.add(konyv1);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(ujsag1);

        for (Kolcsonozheto k:katalogus) {
            System.out.println(k.megjelenitendoNev()+" "+k.meddigKolcsonozoheto());
        }
    }
}
