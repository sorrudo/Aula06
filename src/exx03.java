import java.util.Random;


public class exx03 {
    public static void main(String[] args) {
        /*  3.Faça um algoritmo que gere aleatoriamente através de
        um laço de  repetição  PARA  um  vetor  de  50  elementos  inteiros
          (entre  0 - 9), calcule e exiba:
          •A quantidade de números entre 3 e 7;
          •Quantidade de números pares;
          •A quantidade de números menores que 3;
          •Quantidade de números ímpares.Obs.:
           O  vetor  com  os  50  elementos
           deve  ser  impresso  na  tela também.
         */
        Random aleatorio = new Random();
        int[] number = new int[10];
        int resto;
        int par=0;
        int impar=0;
        int valor;
        int medio=0;
        for (int i=0; i< number.length; i++) {
            valor = aleatorio.nextInt(10);
            System.out.println(valor);
            resto = valor % 2;
            if(valor !=0 && resto == 0) {
                par = par + 1;
            }else if (valor !=0 && resto !=0){
                impar = impar + 1;
            }
            if (valor > 2 && valor < 8){
                medio = medio +1;
            }

        }
        System.out.println("A quantidade de numeros pares são :\n" + par);
        System.out.println("A quantidade de numeros impares são :\n" + impar);
        System.out.println("A quantidade de numeros entre 3 e 7 são :\n" + medio);

    }
}
