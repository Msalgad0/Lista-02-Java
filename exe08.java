import java.util.Scanner;

/*
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
*/
public class exe08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salário:");
        float salario =sc.nextFloat();

        if ( salario <= 2000){
            System.out.println("Insento");

        }else if (salario >= 2000.01 && salario <=3000){
            float insecao = salario - 2000;
            float taxa1 = (salario * 8)/100;
            System.out.println(taxa1);

        } else if (salario >= 3000.01 && salario <= 4500){
            float taxa2 = (salario * 18)/100;
            System.out.println(taxa2);

        } else if (salario >= 4500){
            float taxa3 = (salario * 28)/100;
            System.out.println(taxa3);
        }
    }
}
