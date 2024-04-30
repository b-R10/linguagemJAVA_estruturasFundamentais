/* Escreva um programa que leia 3 valores e escreva a soma dos 2 maiores */

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        float numero1 = objeto.nextFloat();
        System.out.println("Insira o segundo número");
        float numero2 = objeto.nextFloat();
        System.out.println("Insira o terceiro número");
        float numero3 = objeto.nextFloat();
        objeto.close();
        float maior1, maior2;
        
        if(numero1 >= numero2 && numero1 >= numero3){
            maior1 = numero1;
            if (numero2 >= numero3) {
                maior2 = numero2;
            } else {
                maior2 = numero3;
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maior1 = numero2;
            if (numero1 >= numero3) {
                maior2 = numero1;
            } else {
                maior2 = numero3;
            }
        } else {
            maior1 = numero3;
            if (numero1 >= numero2) {
                maior2 = numero1;
            } else {
                maior2 = numero2;
            }
        }

        float soma = maior1 + maior2;

        System.out.println("Soma dos dois maiores valores é: " + soma);
    }
}