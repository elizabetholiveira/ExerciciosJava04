package Lista3;

import java.util.Scanner;

public class SomaDeNNumeros {
    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        int num = 1;
        double soma = 0;

        System.out.println("Vamos somar vários números positivos?!");

        System.out.println("Primeiro me diga: Quantos números você quer?");
        double n = resp.nextInt();

             /*while (num <= n) {
                    System.out.println("Qual o " + num + "º número?");
                    double numero = resp.nextInt();
                    num++;
                    soma = soma + numero;
             }*/

        while (num <= n){
            System.out.println("Qual o " + num + "º número?");
            double numero = resp.nextDouble();
            if (numero < 0){
                System.out.println("Número inválido!");
            } else if (numero >= 0) {
                num++;
                soma = soma + numero;
            }
        }


        System.out.println("A soma final é: "+ soma);


    }
}
