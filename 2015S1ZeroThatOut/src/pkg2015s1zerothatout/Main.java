/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2015s1zerothatout;

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
        // TODO code application logic here
        Scanner john = new Scanner(System.in);
        
        int n = john.nextInt();
        int[] k = new int[100005];
        int l=0;
        
        for (int i=1; i<=n; i++){
        
            int m = john.nextInt();
            if (m==0) {
                l-=1;
                
            }else {
                l +=1;
                k[l] = k[l-1]+m;
            }
        
        }
        
        System.out.println(k[l]);
    }
    
}
