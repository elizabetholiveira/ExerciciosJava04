package Lista3;

import java.util.Scanner;

public class QualOMenor {
    public static void main(String[] args) {

        // - Leia 10 números

        Scanner resp = new Scanner(System.in);

        System.out.println("Vou te dizer qual o maior e o menor de quaisquer dez números! Por favor, responda as perguntas abaixo:");

        double menornumero = Integer.MAX_VALUE;
        double maiornumero = Integer.MIN_VALUE;

        for (int num = 1; num <= 10; num++){
            System.out.println("Qual o " + num + "º número?");
            double numero = resp.nextDouble();
            if (numero < menornumero) {
                menornumero = numero;
            }if (numero > maiornumero) {
                maiornumero = numero;
            }
        }

        System.out.println("O menor número é: " + menornumero);
        System.out.println("O maior número é: " + maiornumero);
        System.out.println("Tenha um bom dia!");

/*        double numero = 0;

        for (int num = 1; num <= 10; num++){
            System.out.println("Qual o " + num + "º número?");
            numero = resp.nextDouble();
        }

        System.out.println("Muito obrigado!");

        // ? Não estou conseguindo selecionar todos os números ?

        // - Qual o maior valor

        double maiornumero = 0;

        if (numero > maiornumero){
            maiornumero = numero;
            System.out.println("O maior número é: " + maiornumero);
        }


        // - Qual o menor valor

        double menornumero= 0;

        if (numero < menornumero){
            menornumero = numero;
            System.out.println("O menor número é: " + menornumero);*/

    }
}
