package Iniciante;

import java.util.Scanner;

/*
--Entrada--
O arquivo de entrada contém 2 valores com uma casa decimal cada um.
--Saída--
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um
espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas,
não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */
public class Media1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double entrada = scanner.nextDouble();

        if (entrada >= 0 && entrada <= 10) {
            a = entrada;
        }

        double entrada2 = scanner.nextDouble();

        if (entrada2 >= 0 && entrada2 <= 10) {
            b = entrada2;
        }

        double calculo = ((a * 3.5) + (b * 7.5)) / 11;
        String media = String.format("%.5f", calculo);

        System.out.println("MEDIA = " + media);

    }
}
