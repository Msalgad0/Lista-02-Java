/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
*/


import java.util.Scanner;

public class exe05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do item:");
        int item = sc.nextInt();
        System.out.println("Digite a quantidade do item");
        int quantidade = sc.nextInt();

        if (item == 1){
            int cachorroQuente = 4 * quantidade;
            System.out.println("Total: R$ "+ (cachorroQuente));
        } else if (item == 2){
            double xSalada = 4.50 * quantidade;
            System.out.println("Total: R$ "+ (xSalada));
        } else if (item ==3){
            int xBacon = 5 * quantidade;
            System.out.println("Total: R$ "+ (xBacon));
        }else if (item == 4){
            int torradaSimples = 2 * quantidade;
            System.out.println("Total: R$ "+ (torradaSimples));
        } else if(item == 5){
            double refrigerante = 1.5 * quantidade;
            System.out.println("Total: R$ "+ (refrigerante));
        }else{
            System.out.println("Digite um item valido!");
        }
        sc.close();
    }
}
