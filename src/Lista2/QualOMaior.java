package Lista2;

import java.util.Scanner;

public class QualOMaior {
    public static void main(String[] args) {
        System.out.println("Vamos descobrir qual é o maior número?");

        Scanner resp = new Scanner(System.in);

        System.out.print("Diga o primeiro número: ");
        double num1 = resp.nextDouble();

        System.out.print("Diga o segundo número: ");
        double num2 = resp.nextDouble();

        if (num1 == num2){
            System.out.println("Os números são iguais!");
        } else if (num1 > num2) {
            System.out.println("O número " + num1 + " é o maior!");
        } else {
            System.out.println("O número " + num2 + " é o maior!");
        }

        System.out.println("Tenha um bom dia!");

    }
}
