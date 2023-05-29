package Lista2;

import java.util.Scanner;

public class MediaDuasNotas {
    public static void main(String[] args) {

        System.out.println("Vamos calcular a média simples das suas duas notas parciais!");

        Scanner resp = new Scanner(System.in);

        System.out.println("Qual a primeira nota parcial?");
        double nota1 = resp.nextDouble();

        System.out.println("Qual a segunda nota parcial?");
        double nota2 = resp.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Sua média final é: " + media);

        if (media == 10){
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Tenha um bom dia!");
    }
}
