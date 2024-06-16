package Iniciante;

import java.util.Scanner;
/*
--Entrada--
O arquivo de entrada contém 2 valores inteiros.
--Saída--
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido
pelo valor correspondente à soma de A e B. Como todos os problemas, não esqueça de imprimir o fim de linha após o
resultado, caso contrário, você receberá "Presentation Error".
 */
public class SomaSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int soma = a + b;

        System.out.println("SOMA = " + soma);
    }
}
