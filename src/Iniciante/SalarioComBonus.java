package Iniciante;

import java.util.Scanner;
/*
--Entrada--
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas
decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor,
respectivamente.
--Saída--
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 */

public class SalarioComBonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeVendedor = scanner.next();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();
        double porcentagem = 15.0;
        double calculo = ((porcentagem / 100) * totalVendas) + salarioFixo;
        String valorFinal = String.format("%.2f", calculo);

        System.out.println("TOTAL = R$ " + valorFinal);
    }
}
