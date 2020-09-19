import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigit(int n) {
        if (n <= 1)
            return n;

        int a = 0;
        int b  = 1;
        int c = 1;
        for (int i = 0; i < n - 1; ++i) {
            c = a+b;
            c=c%10;
            int temp=b;
            b=c;
            a=temp;
        }

        return c;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
}

