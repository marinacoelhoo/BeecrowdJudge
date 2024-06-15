package Iniciante;

import java.util.Scanner;
/*
--Entrada--
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
--Saída--
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto
decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha
após o resultado, caso contrário, você receberá "Presentation Error".
 */
public class AreaDoCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n = 3.14159;
        double raio = scanner.nextDouble();
        double quadrado = Math.pow(raio, 2);
        double area = n * quadrado;
        String result = String.format("%.4f", area);

        System.out.println("A=" + result);
    }
}
