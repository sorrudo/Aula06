import java.util.Scanner;

public class exx02 {
    public static void main(String[] args) {
        /* O professor Wuni Jim Yensonal precisa de um programa para ajudar
         com  um  problema  simples:  para  uma  turma  com  50  alunos precisa
         calcular a média da sala e descobrir quais são os alunos que precisarão
          de  um  atendimento personalizado.  O  fluxo  do  programa deve ser o
          seguinte:
           A.Digitar as 50 notas com um vetor e, para cada nota digitada,
          digitar o nome do aluno correspondente em outro vetor
          B.Calcular a média
          das notas digitadas
          C.Para cada uma das notas que foi digitada e ficou abaixo da média,
           exibir uma mensagem que diga “Chamar o aluno para conversar”
         */
        Scanner leitor = new Scanner(System.in);
        double[] nota = new double[5];
        String[] aluno = new String[5];
        double soma=0, media = 0;
        for (int i=0; i<nota.length; i++) {
            System.out.println("Agora digite a nota do " + (i+1) + "° Aluno");
            nota[i] = leitor.nextDouble();
            leitor.nextLine();
            System.out.println("Digite o nome do " + (i+1) + "° Aluno:");
            aluno[i] = leitor.nextLine();
            soma = soma + nota[i];
        }
        for(int i=0; i < nota.length; i++ ) {
            if(nota[i] < 5 ) {
                System.out.println("Chamar o " + aluno[i] + "  para conversar");
            }
        }
        media = soma / 5;
        System.out.println("A media de nota de todos os alunos são:\n" + media);
        for (int i=0; i< aluno.length; i++) {
            System.out.println(aluno[i]);
        }
    }
}
