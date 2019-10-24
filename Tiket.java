package rs.itcentar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tiket implements ImaBrojeve {
    // popunjavanje
    private List<Integer> brojevi = new ArrayList<>(Konstante.TIKET_NO);
    
    public void popuniTiket() {
        // popunjavam tiket
        Scanner input = new Scanner(System.in);
        for(int i=0;i<Konstante.TIKET_NO;i++) {
            System.out.print("Unesite " + (i+1) + ". broj: ");
            int broj = input.nextInt();
            brojevi.add(broj);
        }
    }
    
    public void stampajTiket() {
        System.out.println(brojevi);
        System.out.println();
    }

    @Override
    public List<Integer> getBrojevi() {
        return brojevi;
    }

    @Override
    public String toString() {
        return "Tiket{" + "brojevi=" + brojevi + '}';
    }
}
