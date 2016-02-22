

//package wind;

import static java.lang.System.exit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int[] a = new int[250];
        
        for (int i=1; i<=240; i++){
            a[i] = i*i*i;
        }
        
        Scanner in = new Scanner(System.in);
        
        int h = in.nextInt();
        int m = in.nextInt();
        
        for (int i=1; i<=m; i++){
            int ans = (-6)*a[i]*i+h*a[i]+2*i*i+i;
            if (ans<=0) {
                System.out.println("The balloon first touches ground at hour:\n"+i);
                exit(0);
            }
        }
        System.out.println("The balloon does not touch ground in the given time.");
        
    }
    
}
