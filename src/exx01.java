import java.util.Scanner;

public class exx01 {
    public static void main(String[] args) {
        /*  Faça um programa que permita ao usuário digitar 30 atividades que ele
            realizou no dia. Ao final, o programa deve possibilitar que o usuário
            escolha se quer exibir as atividades na ordem em que digitou ou em ordem reversa.
         */
        String[] atividade = new String[5];
        byte opcao;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Você vai digitar 30 atividades para guardar:");
        for(int i=0;i< atividade.length;i++) {
            System.out.println("Digite " + (i+1) + "° atividade");
            atividade[i] = leitor.nextLine();
        }
        System.out.println("Se você deseja ver suas atividades em ORDEM, digite (1)");
        System.out.println("Se você deseja ver suas atividades em ORDEM REVERSA, digite (2)");
        opcao = leitor.nextByte();
        if (opcao == 1){
            for (int i=0; i < atividade.length; i++){
                System.out.println(atividade[i]);
            }
        }else if (opcao == 2){
            for (int i= atividade.length-1; i >= 0; i--){
                System.out.println(atividade[i]);
            }
        }else {
            System.out.println("Opção invalida");
        }
    }
}
