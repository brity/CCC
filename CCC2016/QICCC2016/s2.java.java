//package bicycle;

import java.util.Scanner;

public class Main {

    public static void sort1(int[] a, int left, int right){
        
        int x = left; 
        int y = right;
        int q;
                
        int mid = a[(x+y) / 2];
        
        while (x<=y){
        
            while (a[x] > mid) x++;
            while (a[y] < mid) y--;
            
         
            if (x<=y) {
                q = a[x];
                a[x] = a[y];
                a[y] = q;
                
            
                x++;
                y--;
            }
           
        }
       
        if (left<y) sort1(a, left, y);
        if (x<right) sort1(a, x, right);
    }
    
    public static void sort2(int[] a, int left, int right){
        
        int x = left; 
        int y = right;
        int q;
                
        int mid = a[(x+y) / 2];
        
        while (x<=y){
        
            while (a[x] < mid) x++;
            while (a[y] > mid) y--;
            
         
            if (x<=y) {
                q = a[x];
                a[x] = a[y];
                a[y] = q;
                
            
                x++;
                y--;
            }
           
        }
       
        if (left<y) sort2(a, left, y);
        if (x<right) sort2(a, x, right);
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] a = new int[150];
        int[] b = new int[150];
        
        int type = in.nextInt();
        int n = in.nextInt();
        for (int i=1; i<=n; i++){
            a[i] = in.nextInt();
        }
        for (int i=1; i<=n; i++){
            b[i] = in.nextInt();
        }
        
        sort1(a, 1, n);
        
        if (type == 1) sort1(b, 1, n);
        else sort2(b, 1, n);
        
        
        
        int ans = 0;
        
        for (int i=1; i<=n; i++){
            ans+=Math.max(a[i], b[i]);
        }
        System.out.println(ans);
    }
    
}
