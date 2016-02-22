//package review;

import java.util.Scanner;

public class Main {

    public static int get(int x, int y, int[] b){
        int ans=0;
        while (b[x]!=x) {
            ans++;
            x=b[x];
        }
        while (b[y]!=y) {
            ans++;
            y=b[y];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] a = new int[100005];
        int[] b = new int[100005];
     
        for (int i=1; i<=m; i++) a[i]=in.nextInt();
        for (int i=1; i<=n; i++) a[i]=i;
        
        for (int i=1; i<=n-1; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            if (b[x]==x) b[x]=y;
            else b[y]=x;
        }
        
        int x=0;
        int y=0;
        int max=-1;
        
        for (int i=1; i<=m-1; i++){
            for (int j=i+1; j<=m; j++){
                int dis = get(a[i], a[j], b);
                if (dis>max) {
                    max=dis;
                    x=a[i];
                    y=a[j];
                }
            }
        }
        
        System.out.println(max);
        
    }
    
}
