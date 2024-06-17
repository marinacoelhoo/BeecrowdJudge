package Iniciante;

import java.util.Scanner;

/*
--Entrada--
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
--Saída--
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço
em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o
resultado, caso contrário, você receberá "Presentation Error".
 */

public class Media2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double c = 0;
        double entrada = scanner.nextDouble();
        if (entrada >= 0 && entrada <= 10) {
            a = entrada;
        }

        double entrada2 = scanner.nextDouble();
        if (entrada2 >= 0 && entrada2 <= 10) {
            b = entrada2;
        }

        double entrada3 = scanner.nextDouble();
        if (entrada3 >= 0 && entrada3 <= 10) {
            c = entrada3;
        }

        double calculo = (((a * 2) + (b * 3) + (c * 5)) / 10);
        String media = String.format("%.1f", calculo);
        System.out.println("MEDIA = " + media);
    }
}
