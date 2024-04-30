import java.util.Scanner;

public class Exerc5 {
	public static void main(String[] args){
        Scanner objeto = new Scanner(System.in);
        String diasDaSemana[] = {"DOMINGO", "SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SÁBADO"}; 

        System.out.println("Insira o numero 1: ");
        int numero = objeto.nextInt() - 1;
        objeto.close();

        if(1 <= numero && numero <= 7){
    		System.out.println("Dia: " + diasDaSemana[numero]);
        } else {
        	System.out.println("Erro. O numero não corresponde a um dia da semana.");
        }

    }
}


