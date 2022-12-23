package estruturasderepetição;

import java.util.Scanner;

public class EstruturasDeRepetição {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //*Continue */

        /*int cc = 0;
        while (cc<10)  {
            
            cc++;
            if (cc == 2 || cc == 3 || cc == 5) {
                continue;
            }
            if (cc == 8) {
                break;
            }
            System.out.println("Tifu"+ cc);
        */
    
    //* Faça */

        /*int cc = 0;
        do {
        
            System.out.println("Cambalhota!");
            cc++;
        
        } while(cc<4);

        int num, som=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um número: ");
            num = teclado.nextInt();
            som += num;
            System.out.print("Quer continuar ?: ");
            resp = teclado.next(); 
        } while (resp.equals("sim"));
        System.out.println("A soma de todos os valores é igual a: " + som);
        */

        //* Para */

        /*for (int cc=0; cc <= 100; cc+=10) {
            System.out.println(cc);
        }
        */
    }
}
