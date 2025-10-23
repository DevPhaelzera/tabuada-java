import java.util.Scanner;

public class TabuadaPedida {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola! Bem Vindo");
        System.out.println("Qual numero deseja saber a tabuada?");
        int numero = scanner.nextInt();

        int i = 1;

        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
            i++;
        }
        scanner.close();
    }

}
