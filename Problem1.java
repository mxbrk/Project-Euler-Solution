class Problem1 {

  public static void main(String[] args) {
    int a = 3;
    int b = 5;
    int n = 1;
    int result = 1;
    int count1 = 0;
    /*     for (n = 1; n < 10; n++) {
      result = a * n;
      System.out.println(result);
    }
 */
    do {
      //  System.out.println(result);
      result = a * n;
      n++;
      count1 = +result;
    } while (result < 10);

    System.out.println(count1);
  }
}
