package Iniciante;

import java.io.IOException;
import java.util.Scanner;
/*
--Entrada--
A entrada contém 2 valores inteiros.
--Saída--
Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha.
Cuide para que tenha um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.
 */
public class ExtremamenteBasico {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int x = A + B;

        System.out.println("X = " + x);
    }
}
