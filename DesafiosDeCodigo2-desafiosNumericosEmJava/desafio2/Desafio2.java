import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

import java.util.StringTokenizer;





public class Desafio2{

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int numeroColaborador = Integer.parseInt(st.nextToken());



    st = new StringTokenizer(br.readLine());

    int qtHorasTrabalhadas = Integer.parseInt(st.nextToken());



    st = new StringTokenizer(br.readLine());

    double valorPorHora = Double.parseDouble(st.nextToken());



    double salary = qtHorasTrabalhadas * valorPorHora; // Altere o valor da variável com o cálculo esperado

    System.out.println("NUMBER = " + numeroColaborador);

    System.out.printf("SALARY = U$ %.2f", salary);

  }

}
