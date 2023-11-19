public class Problem2 {
  public static void main(String[] args) {
    int a = 0;
    int b = 1;
    int result = 0;
    int sum = 0;

    for (int i = 1; i <= 4000000; i++) {
      if (result <= 4000000) {
        result = a + b;
        a = b;
        b = result;
      }
      if (((result % 2) == 0)) {
        sum = sum + result;
      }
    }
    System.out.println(sum);
  }
}
