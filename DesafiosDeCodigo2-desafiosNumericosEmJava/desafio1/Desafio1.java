import java.io.IOException;

import java.util.Scanner;



public class Desafio1 {

	

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

//declare suas variaveis corretamente

        int pares  = 0;

        int impares = 0;

        int positivos = 0;

        int negativos = 0;

        int entradas = 5;

        



//continue a solução

        for (int i=0; i < entradas; i++) {

          int numero = leitor.nextInt();

          if (numero > 0)

            positivos++;

          else if(numero < 0)

            negativos++; 

          if (numero % 2 == 0)

            pares++;

          else 

            impares++;

        	

        }

//insira suas variaveis corretamente

        System.out.println(pares + " valor(es) par(es)");

        System.out.println(impares + " valor(es) impar(es)");

        System.out.println(positivos + " valor(es) positivo(s)");

        System.out.println(negativos + " valor(es) negativo(s)");

    }

	

}
