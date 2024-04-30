import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanho = 20;
        int numero[] = new int[tamanho];
        for(int i=0; i<tamanho; i++) {
            System.out.println("Digite um número: ");
            numero[i] = scan.nextInt();
        }
        scan.close();


        // Parte A //
        

        // Parte B //

        
        // Parte C //
        int soma = 0;
        for(int i=0; i<tamanho; i++) {
            soma += tamanho;
        }
        float media = (float) soma/tamanho;
        System.out.println("A media dos números é: " + media);

    }
}
