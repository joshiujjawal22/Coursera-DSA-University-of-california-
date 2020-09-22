import java.util.*;

public class Knapsack {

    static int optimalWeight(int W, int[] wt) {
        
        int n = wt.length;
    	int[][] K = new int[n + 1][W + 1];

    	for (int i = 0; i <= n; i++) {
    		for (int w = 0; w <= W; w++) {
    			if (i == 0 || W == 0)
    				K[i][w] = 0;
    			else if (wt[i - 1] <= w)
    				K[i][w] = Math.max(wt[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
    			else 
    				K[i][w] = K[i - 1][w];
    		}
    	}
    	return K[n][W];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}

