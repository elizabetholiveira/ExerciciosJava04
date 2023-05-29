package Lista3;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("Me diga um número inteiro e eu direi se é primo ou não!");
        System.out.println("Qual é o número inteiro?");
        int numero = resp.nextInt();

        int contador = 2;

        while (contador <= numero){
            if (contador == numero){
                System.out.println("O número " + numero + " é primo!");
                contador++;
            }
            if ((numero % contador) == 0) {
                System.out.println("O número " + numero + " não é primo!");
                contador = numero;
                contador++;
            }else {
                contador ++;
                }
            }
        }

        /* A primeira ideia que tive antes de lembrar que tinha que usar for ou while:

        System.out.println("Me diga um número inteiro e eu direi se é primo ou não!");
        System.out.println("Qual é o número inteiro?");
        int numero = resp.nextInt();

        if ((numero == 2) || (numero == 3) || (numero == 5) || (numero == 7) || (numero == 11)){
            System.out.println("O número " + numero + " é primo!");
        }else if ((numero % 2 == 0) || (numero % 3 == 0) || (numero % 5 == 0) || (numero % 7 == 0) || (numero % 11 == 0)){
            System.out.println("O número " + numero + " não é primo!");
        }
        if ((numero % 2 != 0) && (numero % 3 != 0) && (numero % 5 !=0) && (numero % 7 != 0) && (numero % 11 != 0)){
            System.out.println("O número " + numero + " é primo!");
        }*/
    }

