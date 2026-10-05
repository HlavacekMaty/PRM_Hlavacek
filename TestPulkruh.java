package půlkruh;


public class TestPulkruh {
    public static void main(String[] args) {
    Pulkruh d1 = new Pulkruh( 3.5);
    System.out.println(d1);

    Pulkruh d2 = new Pulkruh(-6);
    System.out.println(d2);

    System.out.println("prumer pulkruhu je: " + d1.getPrumer());
    d2.setPrumer(45);
    System.out.println();

    System.out.println("Obsah pulkruhu o prumeru: " + d1.getPrumer() + " je: " + d1.obsah());
    System.out.println("Obvod pulkruhu o prumeru: " + d1.getPrumer() + " je: " + d1.obvod());
    System.out.println("Polomer pulkruhu o prumeru: " + d1.getPrumer() + " je: " + d1.polomer());
    
    }
}
