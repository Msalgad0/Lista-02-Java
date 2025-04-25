/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
*/
import java.util.Scanner;
public class exe03 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um valor a inteiro");
        int valorA = sc.nextInt();
        System.out.println("Digite um valor a inteiro");
        int valorB = sc.nextInt();
        if( valorA % valorB == 0 || valorB % valorA == 0){
            System.out.println("Os valores são multiplos");
        }
        else{
            System.out.println("Os valores não são multiplos");
        }
        sc.close();
    }
}
