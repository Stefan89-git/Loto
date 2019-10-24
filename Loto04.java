package rs.itcentar;

public class Loto04 {

    private static Komisija komisija = Komisija.getInstance();
    private static Tiket tiket = new Tiket();
    private static Bubanj bubanj = new Bubanj();
    private static Pogotci pogotci = new Pogotci();

    public static void main(String[] args) {
        // popunjavam tiket
        try {
            System.out.println("Molimo Vas popunite tiket brojevima [1 - 37]: ");
            tiket.popuniTiket();
            komisija.proveriValidnostTiket(tiket);
            System.out.println("Uneseni brojevi su: ");
            tiket.stampajTiket();

            komisija.proveriIspunjenostUslovaZaIzvlacenje(tiket);

            bubanj.popuniBubanj();
            System.out.println("Izvuceni brojevi su: ");
            bubanj.stampajBubanj();

            komisija.proveriIspunjenostUslovaZaIzvlacenje(bubanj);
            // !ako ima mora da se izvuku ponovo

            // trazimo pogotke
            pogotci.traziPogotke(tiket.getBrojevi(), bubanj.getBrojevi());
            System.out.println();
            // stampa broj pogodata i pogodjene brojeve
            System.out.println("Broj pogodaka je: " + pogotci.getBrojPogodaka());
            System.out.println("Pogodjeni brojevi su: ");
            pogotci.stampajNiz();
            System.out.println();
            // ukoliko se dobije 7-ca stampa se poruka za cestitanje
            pogotci.stampajPorukuZaSedmicu();
        } catch (InvalidNumberRangeExcpetion ex) {
            System.err.println(ex.getMessage());
        } catch (DuplicatesFoundException ex) {
            System.err.println(ex.getMessage());
            System.exit(0);
        }
    }
}
