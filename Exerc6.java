import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args){
        Scanner objetoScan = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int numero = objetoScan.nextInt();
        objetoScan.close();
        boolean flag = true;
        for(int i = 2; i < numero; i++) { 
            if(numero%i == 0) { 
                flag = false;
                break;
            }
            System.out.println(i);
        }
        if(flag)
            System.out.println(numero + " é um número primo");
        if(!flag)
            System.out.println(numero + " não é um número primo.");
    }
}