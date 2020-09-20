import java.io.*;
import java.util.*;

public class BinarySearch {

    static int binarySearch(int[] a, int x) {
        int l = 0, r = a.length-1;
    
        while (l <= r) {

        	int mid = l + (r - l) / 2;

        	if (x < a[mid])
        		r = mid - 1;

        	else if(x > a[mid])
        		l = mid + 1;

        	else
        		return mid;

        }

        return -1;
    }


    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
          b[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
          
            pw.print(binarySearch(a, b[i]) + " ");
        }

        pw.close();
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
