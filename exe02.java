/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
*/

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        if(numero %2 ==0){
            System.out.println("Numero Par");
        }
        else{
            System.out.println("Numero Impar");
        }
        sc.close();
    }
}
