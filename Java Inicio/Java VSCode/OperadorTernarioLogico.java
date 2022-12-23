package operadorternariologico;

import java.util.Scanner;

    public class OperadorTernarioLogico {
        public static void main(String[] args) {
            /*int n1, n2, r;
            n1 = 14;
            n2 = 15;
            r = (n1>n2)?n1+n2:n1-n2;
            System.out.println(r);
            */
            
            /*String n1 = "Daniel";
            String n2 = "Daniel";
            String n3 = new String("Daniel");
            String res;
            res = (n1.equals(n3))?"igual":"diferente";
            System.out.println(res);
            */
            
            int x, y, z;
            x = 4;
            y = 7;
            z = 12;
            boolean r;
            r = (x<y ^ y<z)?true:false;
            System.out.println(r);
            
    }
    
}
