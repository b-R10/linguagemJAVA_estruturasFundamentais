/* Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu perímetro */

public class Exerc1 {
    public static void main (String[] args) {
        float base = 2;
        float altura = 5;
        float area = base * altura;
        float perimetro = 2 * base + 2* altura;
        System.out.println("Area: " + area);
        System.out.println("Perímetro: " + perimetro);
    }   
}