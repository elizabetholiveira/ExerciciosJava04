package Lista2;

import java.util.Scanner;

public class QualProdComprar {
    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("Qual produto você deve comprar? Descubra aqui!");

        System.out.println("Qual o nome do primeiro produto?");
        String prod1 = resp.nextLine();

        System.out.println("Qual o valor do primeiro produto? (use só números)");
        double val1 = resp.nextDouble();

        System.out.printf("O primeiro produto é: " + prod1 + " R$%,.2f%n", val1 );

        System.out.println("Qual o nome do segundo produto?");
        resp.nextLine();
        String prod2 = resp.nextLine();

        System.out.println("Qual o valor do segundo produto? (use só números)");
        double val2 = resp.nextDouble();

        System.out.printf("O segundo produto é: " + prod2 + " R$%,.2f%n", val2);

        System.out.println("Qual o nome do terceiro produto?");
        resp.nextLine();
        String prod3 = resp.nextLine();

        System.out.println("Qual o valor do terceiro produto? (use só números)");
        double val3 = resp.nextDouble();

        System.out.printf("O terceiro produto é: " + prod3 + " R$%,.2f%n", val3);

        if ((val1 < val2) && (val1 < val3)){
            System.out.println("Compre o produto " + prod1 + "!");
        } else if ((val2 < val1) && (val2 < val3)) {
            System.out.println("Compre o produto " + prod2+ "!");
        } else if ((val3 < val1) && (val3 < val2)) {
            System.out.println("Compre o produto " + prod3 + "!");
        }

    }
}
