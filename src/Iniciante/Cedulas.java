package Iniciante;

import java.util.Scanner;

/*
--Entrada--
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
--Saída--
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem:
“Presentation Error”.
 */
public class Cedulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int divisor = 100;
        int resto = 0;
        int nota100 = (valor / divisor);
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;

        if (valor % divisor != 0) {
            resto = valor % divisor;
            nota50 = (resto / 50);
            resto = (resto % 50);
            nota20 = (resto / 20);
            resto = (resto % 20);
            nota10 = (resto / 10);
            resto = (resto % 10);
            nota5 = (resto / 5);
            resto = (resto % 5);
            nota2 = (resto / 2);
            resto = (resto % 2);
            nota1 = (resto);
        }

        System.out.println(valor);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");
    }
}
