//package rice;

import java.util.Scanner;

public class Main {

    public static boolean go(boolean flag, int[] a, int n) {

        int ans = 0;

        for (int i = 1; i <= n - 2; i++) {
            if (ans == 0) {
                if (a[i] == a[i + 2]) {
                    a[i] = a[i] + a[i + 1] + a[i + 2];
                    n -= 2;
                    ans++;

                    for (int j = i + 1; j <= n; j++) {
                        a[j] = a[j + 2];
                    }

                }
                if (a[i] == a[i + 1]) {
                    a[i] = a[i] + a[i + 1];
                    n -= 1;
                    ans++;
                    for (int j = i + 1; j <= n; j++) {
                        a[j] = a[j + 1];
                    }
                }
            }
        }
        if (ans == 0) {
            if (a[n - 1] == a[n]) {
                a[n - 1] = a[n - 1] + a[n];
                n -= 1;
                ans++;

            }
        }
        if (ans == 0) {
            return true;
        }else return false;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[450];
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        boolean flag = false;

        while (!flag) {
            flag = go(flag, a, n);
        }

        int ans = -1;

        for (int i = 1; i <= n; i++) {
            if (a[i] > ans) {
                ans = a[i];
            }
        }

        System.out.println(ans);
    }

}
