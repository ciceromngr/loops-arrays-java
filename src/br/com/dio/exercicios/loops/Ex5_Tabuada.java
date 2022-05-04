package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_Tabuada {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Tabuada: ");
//        int tabuada = scan.nextInt();
//
//        System.out.println("Tabuada de " + tabuada);
//        for(int i = 1; i <= 10; i = i + 1) {
//            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
//        }
//    }
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sair = 0;

    while(sair == 0) {
        System.out.println("Tabuada: ");
        int tabuada = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(tabuada + "*" + i + " = " + (tabuada*i));
        }

        System.out.println("deseja sair? 0 continua 1 sair");
        sair = scanner.nextInt();
    }

    }

    public static void operacao(int numero, String operacao) {

    }
}
