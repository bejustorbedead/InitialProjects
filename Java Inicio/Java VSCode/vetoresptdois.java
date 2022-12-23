import java.util.Arrays;
import java.util.Scanner;

public class vetoresptdois {

    public static void main(String[] args) {
        
        /*int n[]= new int[4];
        n[0] = 1;
        n[1] = 3;
        n[2] = 5;
        n[3] = 7;

        int m[] = {0,2,4,6};
        */

        /*int n[]={0,2,4,6,8};
        System.out.println("O total de casas de N é "+n.length+" casas.");
        for( int c=0; c<=n.length-1; c++) {
            System.out.println("Na posição de: "+c+", Temos o número: "+n[c]+".");
        }
        */

        /*String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner teclado = new Scanner(System.in);
        System.out.print("Estamos em um ano bissexto ? [S/N] ");
        String bis = teclado.next();
        if (bis.equals("S")) {
            dia[1] += 1;
        }
        for (int c=0; c<=mes.length-1; c++) {
            System.out.println("O mês de "+mes[c]+" possui "+dia[c]+" dias.");
        }
         */

        int num[] = {9,0,2,3,1};
        int pos = Arrays.binarySearch(num, 1);
        System.out.println(pos);

        /*double numr[] = {1.25,2.75,3,4.50,0.5};
        Arrays.sort(numr);
        for(double valorr:numr) {
            System.out.println(valorr);
        }
        */
    }
}