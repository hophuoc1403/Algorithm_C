import java.util.Scanner;

public class Fibonacci {
  private static long[] fibonacciCache;

  public static void main(String[] args) {
    System.out.println("enter fibonacci you want to find : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    fibonacciCache = new long[n + 1];

    System.out.println(fibonacci(n));

  }

  private static long fibonacci(int n) {
    if (n <= 1) {
      return n;
    }

    if (fibonacciCache[n] != 0) {
      return fibonacciCache[n];
    }

    long result = fibonacci(n - 1) + fibonacci(n - 2);
    fibonacciCache[n] = result;

    return fibonacciCache[n];
  }
}
