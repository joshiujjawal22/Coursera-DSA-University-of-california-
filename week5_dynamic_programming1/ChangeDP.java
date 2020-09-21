import java.util.Scanner;

public class ChangeDP {
    private static int getChange(int m) {
    	int count=0;
    	if(m==1) return m;
    	if(m==2) return m;
    	if(m==3) return 1;
        count=m/4;
        if(m%4==1 || m%4==2 || m%4==3) count+=1;
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

