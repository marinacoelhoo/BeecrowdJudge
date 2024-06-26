package Iniciante;

import java.util.Scanner;

/*
-- Entrada --
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um
valor com 2 casas decimais.
-- Saída --
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos
e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */

public class CalculoSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codPecaOne = scanner.nextInt();
        int quantPecaOne = scanner.nextInt();
        double valorUnitOne = scanner.nextDouble();

        int codPecaTwo = scanner.nextInt();
        int quantPecaTwo = scanner.nextInt();
        double valorUnitTwo = scanner.nextDouble();

        double calculo = ((quantPecaOne * valorUnitOne) + (quantPecaTwo * valorUnitTwo));

        String result = String.format("%.2f", calculo);

        System.out.println("VALOR A PAGAR: R$ " + result);

    }
}
