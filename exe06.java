
/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */

import java.util.Scanner;

public class exe06 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite um valor");
        int numero = sc.nextInt();

        if (numero >= 0 && numero <= 25){
            System.out.println("Intervalo (0,25]");
        } else if (numero >= 25 && numero <= 50){
            System.out.println("Intervalo (25,50]");
        }else if (numero >=50 && numero <= 75){
            System.out.println("Intervalo (50,75]");
        }else if (numero >= 75 && numero <= 100){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora dos intervalos");
        }
        sc.close();
    }
}
