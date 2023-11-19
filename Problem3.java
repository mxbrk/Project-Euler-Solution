//biggest prime factor of 600851475143
public class Problem3 {

  public static void main(String[] args) {
    String primeNumbers = "";
    int PrimN = 0;

    for (int i = 0; i <= 100; i++) {
      int counter = 0;

      for (int k = i; k >= 1; k--) {
        if (i % k == 0) {
          counter = counter + 1;
        }
      }

      if (counter == 2) {
        primeNumbers = primeNumbers + i + " ";
        PrimN++;
      }
    }
    System.out.printf("Die Summe der Primzahlen von 1 bis 100 ist:\n%d\n\n", PrimN);
    System.out.println("Primzahlen von 1 bis 100 sind:\n" + primeNumbers);
  }
}
// ursprünglicher ansatz: Liste erzeugen und results vom teilen dort speichern, wenn listenlänge = 2 dann ist primzahl vorhanden
