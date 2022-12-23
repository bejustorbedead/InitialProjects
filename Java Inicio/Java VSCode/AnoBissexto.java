import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        String anobi;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Estamos em um ano bissexto ? [S/N] ");
        anobi = teclado.next();
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int dia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diab[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int c = 0; c<=mes.length; c++) {
            if (anobi.equals("N")) {
            System.out.println("o mês de "+mes[c]+" tem "+dia[c]+" dias.");
                } else {
                    System.out.println("o mês de "+mes[c]+" tem "+diab[c]+" dias.");
                }
            }
    }
}
