public class ForExample {
  public static void main(String[] args) {
    while (true) {
      for (String arg : args) {
        sumUpToN(Integer.parseInt(args[0]));
      }
    }
  }

  private static int sumUpToN(int n) {
    int total = 0;
    for (int i = 0; i < n; i++) {
      total += i;
    }
    return total;
  }
}
