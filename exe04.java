/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class exe04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora inicial da partida");
        int horaInicial = sc.nextInt();
        System.out.println("Digite a hora final da partida");
        int horaFinal= sc.nextInt();

        if (horaInicial <=12 ){
            int horaTotal =   horaFinal - horaInicial ;
            System.out.println(horaTotal+"H");
        }
        else if (horaInicial > 13 && horaInicial <= 24){
            int horaTotal =   24 - (horaFinal + horaInicial) ;
            System.out.println(horaTotal+"H");
        }
    }
}
 */


import java.util.Scanner;

public class exe04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora inicial da partida:");
        int horaInicial = sc.nextInt();
        System.out.println("Digite a hora final da partida:");
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaInicial == horaFinal) {
            duracao = 24;
        } else if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");
        sc.close();
    }
}
