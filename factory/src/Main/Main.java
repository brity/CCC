package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package factory;

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
        long[] a = new long[65];
        a[1] = 1;
        a[2] = 2;
        a[3] = 5;
        for (int i=4; i<=60; i++){
        
            a[i] = a[i-3]+a[i-2]+a[i-1];
        
        }
        
        Scanner in = new Scanner(System.in);
        
        for (int i=1; i<=5; i++){
        
            int n = in.nextInt();
            System.out.println(a[n]);
        }
    }
    
}
