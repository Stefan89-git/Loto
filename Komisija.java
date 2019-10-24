package rs.itcentar;

import java.util.List;

public class Komisija {
    private static Komisija instance;

    private Komisija() {}
    
    public static Komisija getInstance() {
        if(instance == null) {
            instance = new Komisija();
        }
        return instance;
    }
    
    // provera validnosti - duplikata
    // da su popunjeni/izvucein svih 7 brojeva
    
    public void proveriValidnostTiket(Tiket t) throws InvalidNumberRangeExcpetion {
        // proveri da li su brojevi u rangu 1 - 37
        List<Integer> brojevi = t.getBrojevi();
        for(int i=0;i<Konstante.TIKET_NO;i++) {
            int broj = brojevi.get(i);
            if(broj < Konstante.TIKET_MIN && broj > Konstante.TIKET_MAX) {
                throw new InvalidNumberRangeExcpetion(t, String.format("Uneseni tiket nije validan: %s", t));
            }
        }
    }
    
    public boolean proveriDuplikate(List<Integer> brojevi, int length) {
        // proveri da li ima duplikata
        for(int i=0;i<length-1;i++) {
            int b1 = brojevi.get(i);
            for(int j=i+1;j<length;j++) {
                int b2 = brojevi.get(j);
                if(b1 == b2) {
                    // ako ima ispisi gresku
                    System.err.println("U nizu ima ponovljenih brojeva!");
                    return true;
                }
            }
        }
        return false;
    }
    
    public void proveriIspunjenostUslovaZaIzvlacenje(ImaBrojeve brojevi) throws DuplicatesFoundException{
        boolean duplikati = proveriDuplikate(brojevi.getBrojevi(), Konstante.TIKET_NO);
        if(duplikati) {
            throw new DuplicatesFoundException(brojevi,
                    String.format("Pronadjeni su duplikati brojeva [%s] te uslovi nisu ispunjeni", brojevi.getBrojevi()));
        }
    }
}
