package Lista2;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {

        System.out.println("Seleciona o dia da semana (digite o número)");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda-feira");
        System.out.println("3 - Terça-feira");
        System.out.println("4 - Quarta-feira");
        System.out.println("5 - Quinta-feira");
        System.out.println("6 - Sexta-feira");
        System.out.println("7 - Sábado");

        Scanner num = new Scanner(System.in);

        int semana = num.nextInt();

        switch (semana){
            case 1:
                System.out.println("Você selecionou: Domingo");
                break;
            case 2:
                System.out.println("Você selecionou: Segunda-feira");
                break;
            case 3:
                System.out.println("Você selecionou: Terça-feira");
                break;
            case 4:
                System.out.println("Você selecionou: Quarta-feira");
                break;
            case 5:
                System.out.println("Você selecionou: Quinta-feira");
                break;
            case 6:
                System.out.println("Você selecionou: Sexta-feira");
                break;
            case 7:
                System.out.println("Você selecionou: Sábado");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
