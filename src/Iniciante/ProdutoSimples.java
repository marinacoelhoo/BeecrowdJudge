package Iniciante;

import java.util.Scanner;
/*
--Entrada--
O arquivo de entrada contém 2 valores inteiros.
--Saída--
Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade
Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem:
“Presentation Error”.
 */
public class ProdutoSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int PROD = a * b;

        System.out.println("PROD = " + PROD);
    }
}
