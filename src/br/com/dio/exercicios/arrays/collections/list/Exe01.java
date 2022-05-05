package br.com.dio.exercicios.arrays.collections.list;

import java.text.DecimalFormat;
import java.util.*;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        Random random = new Random();

//      manual
        //Add temp in list
//        int count = 0;
//         while(count < 6) {
//             System.out.println("Digite a temperatura: ");
//             double temp = scanner.nextDouble();
//             temperaturas.add(temp);
//             count++;
//         }
//      aleatorio
        for(int i = 1; i <= 6; i++ ) {
            DecimalFormat decimalFormat = new DecimalFormat("0,00");
            double num = random.nextDouble() * 5000;
            String numStr = decimalFormat.format(num);
            double newParseNum = Double.parseDouble(numStr);
            temperaturas.add(newParseNum);
        }

        //exibindo todas as temperaturas:
        System.out.print("Todas as temperaturas: ");
        System.out.println(temperaturas); // array completo
        temperaturas.forEach(t -> System.out.print(t + " ")); // varrendo o array e trazendo cada temperatura

        //calculando e exibindo a média das temperaturas:
        System.out.print("Temperaturas acima da média: ");
        Double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        //exibindo as temperaturas acima da média
        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f ", t));
        //exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }
    }

}

//        Scanner scan = new Scanner(System.in);
//        List<Double> temperaturas = new ArrayList<Double>();
//
//        //Adicionando as temperaturas na lista:
//        int count = 0;
//        while (true) {
//            if (count == 6) break;
//
//            System.out.print("Digite a temperatura: ");
//            double temp = scan.nextDouble();
//            temperaturas.add(temp);
//            count++;
//        }
//        System.out.println("-----------------");
//
//        //exibindo todas as temperaturas:
//        System.out.print("Todas as temperaturas: ");
//        temperaturas.forEach(t -> System.out.print(t + " "));
//
//        //calculando e exibindo a média das temperaturas:
//        double media = temperaturas.stream()
//                .mapToDouble(Double::doubleValue)
//                .average()
//                .orElse(0d);
//        System.out.printf("\nMédia das temperaturas: %.1f\n", media);
//
//        //exibindo as temperaturas acima da média
//        System.out.print("Temperaturas acima da média: ");
//        temperaturas.stream()
//                .filter(t -> t > media)
//                .forEach(t -> System.out.printf("%.1f ", t));
//
//        //exibindo o mês das temperaturas acima da média por extenso:
//        System.out.println("\n\nMeses das temperaturas acima da média: ");
//        Iterator<Double> iterator = temperaturas.iterator();
//
//        count = 0;
//        while (iterator.hasNext()) {
//            Double temp = iterator.next();
//            if (temp > media) {
//                switch (count) {
//                    case (0):
//                        System.out.printf("1 - janeiro: %.1f\n ", temp);
//                        break;
//                    case (1):
//                        System.out.printf("2 - fevereiro: %.1f\n", temp);
//                        break;
//                    case (2):
//                        System.out.printf("3 - março: %.1f\n", temp);
//                        break;
//                    case (3):
//                        System.out.printf("4 - abril: %.1f\n", temp);
//                        break;
//                    case (4):
//                        System.out.printf("5 - maio: %.1f\n", temp);
//                        break;
//                    case (5):
//                        System.out.printf("6 - junho: %.1f\n", temp);
//                        break;
//                    default:
//                        System.out.println("Não houve temperatura acima da média.");
//                }
//            }
//            count++;
//        }