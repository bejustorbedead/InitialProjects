import java.util.Scanner;
import java.util.SortedMap;

public class metodopt2 {
    static void soma (int a, int b) {
        int s = a + b;
        System.out.println("A soma é: "+s);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva o valor de A: ");
        int a = teclado.nextInt();
        System.out.print("Escreva o valor de B: ");
        int b = teclado.nextInt();
        soma(a, b);
    }
}
