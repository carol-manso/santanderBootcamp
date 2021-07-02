import java.io.IOException;

import java.util.Scanner;



public class Desafio {

	

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int cont = 0; 

        float x = 0;

        

        for(int i = 0; i< 6; i++){

          x = leitor.nextFloat();

          if(x > 0){

            cont ++;

          }

        }

        

        System.out.println(cont  + " valores positivos");

    }

	

}
