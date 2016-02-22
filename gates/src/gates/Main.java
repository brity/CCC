//package gates;

import java.util.Scanner;

public class Main {

    public static void sort(int[] a, int[] b, int left, int right) {

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
                
                q = b[x];
                b[x] = b[y];
                b[y] = q;
            
                x++;
                y--;
            }
           
        }
       
        if (left<y) sort(a, b, left, y);
        if (x<right) sort(a, b, x, right);
        
        
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        int p = in.nextInt();

        int[] a = new int[g+5];
        int[] b = new int[g+5];
       // boolean[] c = new boolean[g+5];
        int[] d = new int[g+5];

        for (int i = 1; i <= p; i++) {

            a[i] = in.nextInt();
            b[i] = i;

           // c[i] = false;
        }

        sort(a, b, 1, p); //sort the (request) order of the plane while keeping their landing order 
        
        int l = 1;
        int lock = 100010;
        for (int i=1; i<=p; i++){ //if we still have gates open
            if (l<=g){//if we still have plane to check
            
                if (a[i] >= l) { //if the request fits the situation
                
                   // c[l] = true;
                    d[l] = b[i]; //record the landing order
                    l++; //move to next plane
                }
                
            
                else { //if we cant fit the request
                    if (a[i-1] == a[i]) { //if the request overwrite the previous one
                        d[l-1] = b[i]; //change the record
                        if (b[i-1]<lock) lock = b[i-1]; //locate the lock down order
                    }
                    else if (b[i]<lock) lock = b[i]; //locate the lock down order
                    
                }
            
            }
        }
        
        int ans = 0;
        for (int i=1; i<=l-1; i++){
            if (d[i]<=lock) ans++; //check all the valid request before the lock down order
        }
        
        System.out.println(ans);

    }

}
