//package acis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[2000005];
        int[] b = new int[2000005];
       // int[] c = new int[2000005];

        int xx = 0;
        int yy = 0;
        for (int i = 1; i <= n; i++) {
            xx = in.nextInt();
            a[xx]++;
            if (xx>yy) yy=xx;
        }

        int max = 0;
        int ans = -1;

        for (int i = 1; i <= yy; i++) {
            if (a[i] > max) {
                max = a[i];
                ans = 1;

                b[ans] = i;
            } else if (a[i] == max) {
                ans++;

                b[ans] = i;
            }
        }

        if (ans > 1) {
            System.out.println(b[ans] - b[1]);
        } else {

            int maxx = b[1];
            a[maxx] = 0;
            
            max = 0;
            ans = -1;
            for (int i = 1; i <= yy; i++) {
                if (a[i] > max) {
                    max = a[i];
                    ans = 1;

                    b[ans] = i;
                } else if (a[i] == max) {
                    ans++;

                    b[ans] = i;
                }
            }

            if (ans==1) System.out.println(Math.abs(maxx-b[1]));
            else {
                int num = -1;
                for (int i=1; i<=ans; i++){
                    if (Math.abs(b[i]-maxx)>num) num = Math.abs(b[i]-maxx);
                }
                System.out.println(num);
            }
            
        }

    }

}
