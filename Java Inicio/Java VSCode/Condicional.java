package condicional;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        /*Scanner teclado = new Scanner(System.in);
          System.out.print("Digite sua primeira nota: ");
          float n1 = teclado.nextFloat();
          System.out.print("Digite sua segunda nota: ");
          float n2 = teclado.nextFloat();
          float m = (n1+n2)/2;
          System.out.print("Sua média foi: " + m);
          if (m>=7){
              System.out.println(", Parabéns!");
        */
        
        /*System.out.println("Sera que voce ja pode votar ?");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano estamos ? ");
        int a1 = teclado.nextInt();
        System.out.print("Em que ano você nasceu ? ");
        int a2 = teclado.nextInt();
        int an = (a1-a2);
        if (an>=18) {
            System.out.println("Voce ja pode votar !");
        } else {
            System.out.println("Voce ainda nao pode votar !");
        } */
        
        //* estruturas condicionais composta
        
        /*System.out.println("Vamos checar se voce pode votar.");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano estamos ? ");
        int aa = teclado.nextInt();
        System.out.print("Qual sua data de nascimento ? ");
        int an = teclado.nextInt();
        int m = (aa-an);
        System.out.print("Sua idade eh : " + m);
        if (m<16) {
            System.out.println(", Voce nao pode votar!");
        } else if ((16<=m && m<18) || (m>70)) {
                System.out.println(", Voce pode votar opcionalmente!");
            } else {
                System.out.println(", Voce vota obrigatoriamente!");
            }
        */
        //*condição de multiplas escolhas
        
    Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas ? ");
        int perna = teclado.nextInt();
        String tipo;
        System.out.print("Isto eh um(a) ");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripede";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "Et";
                break;
        }
        System.out.println(tipo);
    }
}
