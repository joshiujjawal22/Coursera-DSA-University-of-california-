import java.util.*;
import java.io.*;

public class MajorityElement {
    private static int getMajorityElement(int[] a) {
        int index=0;
        int count=1;
        for(int i=1;i<a.length;i++){

            if(a[index]==a[i]) count++;
            else count--;
            if(count==0) {
                index=i;
                count=1;
        } 

        }
        return a[index];
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int found=getMajorityElement(a);
        
        int c=0;
        
        for(int i=0;i<n;i++)
        {
            if(found==a[i]) c++;
        }

        if(c>n/2) System.out.println(1);
        else System.out.println(0);
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

