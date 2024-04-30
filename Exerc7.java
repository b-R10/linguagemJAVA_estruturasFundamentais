import java.util.Scanner;

public class Exerc7 {
	public static void main(String[] args){
        int tamanho = 10, pares = 0;
		Scanner objetoScan = new Scanner(System.in);
		int vetor[] = new int[tamanho];
		for(int i=0; i<tamanho; i++){
			System.out.println("Insira o número da posição " + (i+1) + ": " );
			vetor[i] = objetoScan.nextInt();
		}
        objetoScan.close();
        for(int i=0; i<tamanho; i++){
            if(vetor[i]%2 == 0)
                pares++;
        }
        System.out.println("A quantidade de números pares é: " + pares);
	}
}
