package Iniciante;

import java.util.Scanner;
/*
--Entrada--
O arquivo de entrada contém 4 valores inteiros.
--Saída--
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 */

public class Diferenca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int calculo = (a * b) - (c * d);
        int diferenca = calculo;
        System.out.println("DIFERENCA = " + diferenca);
    }
}
