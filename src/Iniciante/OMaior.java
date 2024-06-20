package Iniciante;

import java.util.Scanner;
/*
--Entrada--
O arquivo de entrada contém três valores inteiros.
--Saída--
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */

public class OMaior {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maior = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > maior) {
            maior = a;
        }
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

        System.out.println(maior + " eh o maior");
    }
}
