package Iniciante;

import java.util.Objects;
import java.util.Scanner;
/*
-- Entrada --
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima,
com todas as letras minúsculas.
-- Saída --
Imprima o nome do animal correspondente à entrada fornecida.
 */

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String primeiroAnimal = scanner.next();
        String segundoAnimal = scanner.next();
        String terceiroAnimal = scanner.next();
        String nomeAnimal = null;
        boolean vertebrado = Objects.equals(primeiroAnimal, "vertebrado");
        boolean ave = Objects.equals(segundoAnimal, "ave");
        boolean onivoro = Objects.equals(terceiroAnimal, "onivoro");
        boolean carnivoro = Objects.equals(terceiroAnimal, "carnivoro");
        boolean anelideo = Objects.equals(segundoAnimal, "anelideo");
        boolean hematofago = Objects.equals(terceiroAnimal, "hematofago");

        if(vertebrado && ave && onivoro) {
            nomeAnimal = "pomba";
        } else if (vertebrado && onivoro) {
            nomeAnimal = "homem";
        } else if (carnivoro) {
            nomeAnimal = "aguia";
        } else if (vertebrado){
            nomeAnimal = "vaca";
        } else if(anelideo && onivoro){
            nomeAnimal = "minhoca";
        } else if(anelideo){
            nomeAnimal = "sanguessuga";
        } else if(hematofago){
            nomeAnimal = "pulga";
        } else {
            nomeAnimal = "lagarta";
        }

        System.out.println(nomeAnimal);
    }
}
