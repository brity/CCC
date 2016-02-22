

//package ragaman;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] a = new int[150];
        int ans = 0;
        
        String str = in.next();
        int l = str.length();
        String str1 = in.next();
        int l1 = str1.length();
        
        if (l!=l1) System.out.println('N');
        else {
            
            for (int i=1; i<=l;i++){
                a[(int)str.charAt(i-1)]++;
            }
            
            for (int i=1; i<=l; i++){
                
                char x = str1.charAt(i-1);
                if ((int)x==42) ans++;
                else {
                    a[(int)x]--;
                    l1--;
                    if (a[(int)x]<0) {
                        System.out.println('N');
                        exit(0);
                    }
                }
            }
            
            if (l1!=ans) System.out.println('N');
            else System.out.println('A');
            
        }
    }
    
}
