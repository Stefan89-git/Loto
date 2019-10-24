package rs.itcentar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bubanj implements ImaBrojeve {
    private static Komisija komisija = Komisija.getInstance();
    // izvucku brojevi
    private List<Integer> brojevi = new ArrayList<>(Konstante.TIKET_NO);
    
    public void popuniBubanj() {
        // izvlace se brojevi iz bubnja
        Random rnd = new Random();
        for(int i=0;i<Konstante.TIKET_NO;i++) {
            // int broj = TIKET_MIN + (int)(Math.random() * TIKET_MAX);
            int broj = rnd.nextInt(Konstante.TIKET_MAX);
            // proveri da li su brojevi u rangu 1 - 37
            if(broj >= Konstante.TIKET_MIN && broj <= Konstante.TIKET_MAX) {
                brojevi.add(broj);
                if(komisija.proveriDuplikate(brojevi, i+1)) {
                    --i;
                }
            } else {
                System.err.println("Korak nazad!");
                --i;
            }
        }
    }
    
    public void stampajBubanj() {
        System.out.print(brojevi);
        System.out.println();
    }

    @Override
    public List<Integer> getBrojevi() {
        return brojevi;
    }
}
