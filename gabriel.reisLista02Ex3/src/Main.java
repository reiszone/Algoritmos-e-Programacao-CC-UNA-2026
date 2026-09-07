import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            int quadrado = numero * numero;
            System.out.println("O número " + numero + " é PAR.");
            System.out.println("O quadrado de " + numero + " é: " + quadrado);
        } else {
            int cubo = numero * numero * numero;
            System.out.println("O número " + numero + " é ÍMPAR.");
            System.out.println("O cubo de " + numero + " é: " + cubo);
        }
    } }

