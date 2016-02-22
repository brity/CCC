//package fram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[][] a = new int[801][801];//801
        //int[][] d = new int[801][801];
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 1; i <= m; i++) {
            int k = in.nextInt();
            for (int j = 1; j <= k; j++) {
                b[j] = in.nextInt();
            }
            for (int j = 1; j <= k; j++) {
                c[j] = in.nextInt();
            }

            for (int j = 1; j <= k - 1; j++) {
                if (a[b[j]][b[j + 1]] == 0) a[b[j]][b[j + 1]]= c[j];
                else a[b[j+1]][b[j]] = c[j];
                
            }
            if (a[b[k]][b[1]] == 0) a[b[k]][b[1]] = c[k];
            else a[b[1]][b[k]] = c[k];
 
        }

        int ans = 0;
        int minx = 0;
        int miny = 0;

        int min = 100000000;

        for (int ii = 1; ii <= m - 1; ii++) {
            for (int i = 1; i <= 800; i++) {
                for (int j = 1; j <= 800; j++) {
                    if (a[i][j] < min && a[i][j]>0 && a[i][j]==a[j][i]) {
                        min = a[i][j];
                        minx = i;
                        miny = j;
                    }
                }
            }
//System.out.println(min+" "+minx+" "+miny);
            a[minx][miny] = 0;
            a[miny][minx] = 0;
            ans += min;
            min = 100000000;
        }
        
        System.out.println(ans);

    }

}
