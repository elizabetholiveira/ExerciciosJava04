package Lista1;

public class ZerarFilaBanco {

    public static void main(String[] args) {

        System.out.println("Hoje vou narrar a rotina do nosso banco!");
        System.out.println("Na parte da manhã liberamos 30 fichas de fila. Que logo foram preenchidas!");

        for(int entra = 1; entra <= 30; entra++){
            System.out.println("Uma pessoa entrou! Agora temos " + entra + " pessoa(s) na fila!" );
        }

        System.out.println("E todas as pessoas foram atendidas com perfeição e puderam sair satisfeitas!");

        for(int sai = 29; sai >= 0; sai--){
            System.out.println("Uma pessoa saiu satisfeita! Agora temos " + sai + " pessoa(s) na fila!" );
        }

        System.out.println("Que manhã incrível!");
    }
}
