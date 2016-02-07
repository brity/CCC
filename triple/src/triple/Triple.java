package triple;

import java.util.Scanner;

public class Triple {

    public int num = 0;
    
    public void f(int n,String str, String last, boolean flag) {

        if (!last.equals("111")) {

            if (!flag) {
                if (last.equals("000")) {
                    flag = true;
                }
            }
            f(n+1, str + '0', last.substring(1) + '0', flag);

            
            f(n+1,str + '1', last.substring(1) + '1', flag);
        }

    }

    public void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        int r = in.nextInt();
        
        num = r;

        f(l, "000","000",true);

    }

}
