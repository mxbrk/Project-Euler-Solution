public class Problem1 {
  public static void main(String[] args) {
    int a=3, b=5, n=1, result=1, count1=0;
    do {
      result = a * n;
      n++;
      count1 = +result;
    } while (result < 10);
    System.out.println(count1);
  }
}
