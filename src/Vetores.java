import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        int[] aluno = new int[10];
        double  total = 0;
        Scanner leitor = new Scanner(System.in);
        for(int i=0; i<10; i++) {
            System.out.println("Digite o consumo do Aluno" + (i+1));
            aluno [i] = leitor.nextInt();
            total = total + aluno[i];
        }
        for (int i=0; i<10; i++) {
            System.out.println("O Aluno " +(i+1)+ " consumiu R$" + aluno [i]);
        }
        System.out.println("O total de consumo foi ? \n R$ " + total);
        leitor.close();


    }

}

