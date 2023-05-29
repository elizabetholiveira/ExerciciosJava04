package Lista2;

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {

        // Pegar o salário atual
        // O reajuste
        // E o salário

        // Salario até (<=) 280 -> +20%
        // Salario 281 ~ 700 -> +15%
        // Salario 701 ~ 1500 -> +10%
        // Salario (>=) 1501 -> +5%

        // Informar:
        // - Salario antes
        // - % do aumento
        // - Valor do aumento
        // - Salario depois

        System.out.println("Olá, vamos calcular o reajuste do salário.");

        Scanner dado = new Scanner(System.in);

        System.out.println("Qual o salário antigo? (digite apenas números)");
        double salarioAntes = dado.nextDouble();

        double salarioDepois = 0;
        double aumento = 0;

        if (salarioAntes <= 280){
            aumento = (salarioAntes * 20) / 100;
            salarioDepois = salarioAntes + aumento;
            System.out.printf("O salário antigo é: R$%,.2f%n", salarioAntes);
            System.out.println("A porcentagem do aumento é de: 20%");
            System.out.printf("O aumento foi de: R$%,.2f%n", aumento);
            System.out.printf("O salário novo é: R$%,.2f%n", salarioDepois);
        } else if ((salarioAntes > 280) && (salarioAntes <= 700)) {
            aumento = (salarioAntes * 15) / 100;
            salarioDepois = salarioAntes + aumento;
            System.out.printf("O salário antigo é: R$%,.2f%n", salarioAntes);
            System.out.println("A porcentagem do aumento é de: 15%");
            System.out.printf("O aumento foi de: R$%,.2f%n", aumento);
            System.out.printf("O salário novo é: R$%,.2f%n", salarioDepois);
        } else if ((salarioAntes > 700) && (salarioAntes <= 1500)) {
            aumento = (salarioAntes * 10) / 100;
            salarioDepois = salarioAntes + aumento;
            System.out.printf("O salário antigo é: R$%,.2f%n", salarioAntes);
            System.out.println("A porcentagem do aumento é de: 10%");
            System.out.printf("O aumento foi de: R$%,.2f%n", aumento);
            System.out.printf("O salário novo é: R$%,.2f%n", salarioDepois);
        } else if (salarioAntes > 1500) {
            aumento = (salarioAntes * 5) / 100;
            salarioDepois = salarioAntes + aumento;
            System.out.printf("O salário antigo é: R$%,.2f%n", salarioAntes);
            System.out.println("A porcentagem do aumento é de: 5%");
            System.out.printf("O aumento foi de: R$%,.2f%n", aumento);
            System.out.printf("O salário novo é: R$%,.2f%n", salarioDepois);
        }
    }
}
