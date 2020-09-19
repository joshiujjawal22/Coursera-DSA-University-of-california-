import java.util.*;

public class LCM {

  private static long gcd(long a, long b) {
    
   	long divisor = a >= b ? a : b;
    long dividend = a <= b ? a : b;

    while (divisor != 0) {

		long remainder = dividend % divisor;
		dividend = divisor;
		divisor = remainder;

    }

    return dividend;

}

  private static long lcm(long a, long b) {
    return (a * b) / gcd(a, b);
  }


  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm(a,b));
  }
}
