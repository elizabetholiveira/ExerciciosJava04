package Lista3;

public class Soma50impares {

    public static void main(String[] args) {

        int soma = 0;

        System.out.println("Os 50 primeiros números ímpares são: ");

        for (int num = 1; num <= 100 ; num += 2){
            System.out.println(num);
            soma = soma + num;
        }

        System.out.println("A soma desses números é: " + soma);
    }
}
