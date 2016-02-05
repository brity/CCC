/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2015s2jerseys;

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
        Scanner in = new Scanner(System.in);

        int j = in.nextInt();
        int a = in.nextInt();

        int[] jersey = new int[1000005];
        boolean[] check = new boolean[1000005];

        for (int i = 1; i <= j; i++) {
            String k = in.next();
            if (k.equals("S")) {
                jersey[i] = 1;
            } else if (k.equals("M")) {
                jersey[i] = 2;
            } else if (k.equals("L")) {
                jersey[i] = 3;
            }
            check[i] = false;
        }

        int ans = 0;

        for (int i = 1; i <= a; i++) {

            String k = in.next();
            int num = in.nextInt();
            int q = 0;
            if (!check[num]) {

                if (k.equals("S")) {
                    q = 1;
                } else if (k.equals("M")) {
                    q = 2;
                } else if (k.equals("L")) {
                    q = 3;
                }
                
                if (q<=jersey[num]) {
                    check[num] = true;
                    ans+=1;
                }
                
            }

        }
        
        System.out.println(ans);
    }

}
