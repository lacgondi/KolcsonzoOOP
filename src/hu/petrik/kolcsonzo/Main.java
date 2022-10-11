package hu.petrik.kolcsonzo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Kolcsonozheto> katalogus = new ArrayList<>();
    static List<Dvd> dvdk = new ArrayList<>();

    public static void main(String[] args) {
        Konyv konyv1= new Konyv("Dune", "Frank Herbert", "AABBCC-112233");
        Dvd dvd1 = new Dvd("Interstellar", 169);
        Dvd dvd2 = new Dvd("Inception", 148);
        Dvd dvd3 = new Dvd("Dark Knight", 152);
        Dvd dvd4 = new Dvd("Tenet", 150);
        Dvd dvd5 = new Dvd("Dunkirk", 106);
        Dvd dvd6 = new Dvd("Memento", 113);
        Ujsag ujsag1= new Ujsag("Képes sport", 2007, 23);

        katalogus.add(konyv1);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(ujsag1);

        dvdk.add(dvd1);
        dvdk.add(dvd2);
        dvdk.add(dvd3);
        dvdk.add(dvd4);
        dvdk.add(dvd5);
        dvdk.add(dvd6);

        System.out.println();

        for (Kolcsonozheto k:katalogus) {
            System.out.println(k.megjelenitendoNev()+" "+k.meddigKolcsonozoheto());
        }

        System.out.println("Sima sorrend");
        for (Dvd d: dvdk){
            System.out.println((d.megjelenitendoNev()+" "+d.megjelenitendoNev()));
        }
        Collections.sort(dvdk);
        System.out.println("Rendezett sorrend");
        for (Dvd d: dvdk){
            System.out.println((d.megjelenitendoNev()+" "+d.megjelenitendoNev()));
        }
    }
}
