package quicksort;

/**
 *
 * @author lenovo
 */
public class Quicksort {

    public static void sort(int[] a, int left, int right) {

        int x = left;
        int y = right;
        int q;

        int mid = a[(x + y) / 2];

        while (x <= y) {

            while (a[x] < mid) {
                x++;
            }
            while (a[y] > mid) {
                y--;
            }

            //System.out.println(x+" "+y);
            if (x <= y) {
                q = a[x];
                a[x] = a[y];
                a[y] = q;

             
                x++;
                y--;
            }

        }
        //System.out.println(x+" "+y);
        if (left < y) {
            sort(a,  left, y);
        }
        if (x < right) {
            sort(a, x, right);
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] a = {0, 4, 1, 1};
       // int[] b = {1, 2, 3};
        sort(a, 1, 3);
    }

}
