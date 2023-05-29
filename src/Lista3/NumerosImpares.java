package Lista3;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {

        // - Some números ímpares
        // - Intervalo definido pelo usuário
        // - Se o usuário digitar um valor inválido aparecer mensagem de erro: "Intervalo de valores inválido"

        System.out.println("Defina um intervalo e calcularei a soma de todos os números ímpares dele!");

        Scanner resp = new Scanner(System.in);

        double numinicio = 0;
        double soma = 0;

        System.out.println("Digite o número ímpar inicial:");
        numinicio = resp.nextDouble();

        System.out.println("Digite o número ímpar final");
        double numfinal = resp.nextDouble();

        if (numinicio > numfinal){
            System.out.println("Intervalo de valores inválido!");
        }else {
            while (numinicio <= numfinal) {
                System.out.println(numinicio);
                soma =soma + numinicio;
                numinicio += 2;
            }
        }

        System.out.println("A soma de todos os números ímpares é: " + soma);

    }
}
