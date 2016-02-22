

//package circle;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void go(char[] a, int l, boolean[] b){
        
        for (int i=2; i<=l-1;i++){
            if (a[i-1]=='1'^a[i+1]=='1') b[i]=true;
            else b[i]=false;
        }
        if (a[l]=='1'^a[2]=='1') b[1]=true;
            else b[1]=false;
        if (a[l-1]=='1'^a[1]=='1') b[l]=true;
            else b[l]=false;
        
        for (int i=1; i<=l; i++){
            if (b[i]) a[i]='1';
            else a[i]='0';
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        char[] a = new char[20];
        boolean[] b = new boolean[20];
        
        
        int l = in.nextInt();
        long t = in.nextLong();
        
        String str = in.next();
        //System.out.println(str);
        
        for (int i=1; i<=l;i++) a[i]=str.charAt(i-1);
        
        for (long i=1; i<=t; i++) go(a, l, b);
        
        for (int i=1; i<=l; i++) System.out.print(a[i]);
        
    }
    
}
