

//package count;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        if (n==5||n==6||n==4) System.out.println(3);
        else if (n==2||n==3||n==7||n==8) System.out.println(2);
        else System.out.println(1);
        
    }
    
}
