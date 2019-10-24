package rs.itcentar;

import java.util.ArrayList;
import java.util.List;

public class Pogotci {
    private List<Integer> pogotci = new ArrayList<>();
    private int brojPogodaka = 0;
    // nadji pogodjene brojeve
    // broj pogotke
    // ako je 7 stampaj poruku
    
    public void traziPogotke(List<Integer> tiket, List<Integer> bubanj) {
        // brojimo pogotke i popunjavamo niz pogodaka
        for(int i=0;i<Konstante.TIKET_NO;i++) {
            for(int j=0;j<Konstante.TIKET_NO;j++) {
                int t = tiket.get(i);
                int b = bubanj.get(j);
                if(t == b) {
                    pogotci.add(tiket.get(i));
                }
            }
        }
        brojPogodaka = pogotci.size();
    }
    
    public void stampajNiz(){
        System.out.println(pogotci);
        System.out.println();
    }
    
    public void stampajPorukuZaSedmicu() {
        if(brojPogodaka == Konstante.TIKET_NO) {
            System.out.println("CESTITAMO !!!");
        }
    }

    public List<Integer> getPogotci() {
        return pogotci;
    }

    public int getBrojPogodaka() {
        return brojPogodaka;
    }
}
