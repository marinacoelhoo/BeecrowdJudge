package Iniciante;

import java.util.Scanner;
/*
--Entrada--
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de
horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.
--Saída--
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da
igualdade. No caso do salário, também deve haver um espaço em branco após o $.
 */
public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroFuncionario = scanner.nextInt();
        int horasTrabalho = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        double calculo = (horasTrabalho * valorHora);
        String salario = String.format("%.2f", calculo);

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + salario);
    }
}
