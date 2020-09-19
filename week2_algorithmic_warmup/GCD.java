import java.util.*;

public class GCD {
  static void gcd(int a, int b) {
    
    if(b==0) {System.out.println(a);return;}

    int c=a%b;

    gcd(b,c);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    if(a>b) gcd(a,b);
    else gcd(b,a);

  }
}
