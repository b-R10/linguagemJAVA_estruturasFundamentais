/* Escreva um programa que leia um número e exiba se ele é positivo ou negativo */

import java.util.Scanner;       // Importar classe Scanner

public class Exerc3 {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);     // Criar objeto Scanner
        System.out.println("Insira um número:");
        int numero = objeto.nextInt();          // ler a entrada do usuário
        objeto.close();
        if(numero < 0) {
            System.out.println("Negativo.");
        } else {
            System.out.println("Positivo.");
        }
    }
}