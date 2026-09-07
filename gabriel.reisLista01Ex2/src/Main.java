import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1;
        double n2;
        double n3;
        double soma;
        double aritmetica;

        System.out.print("Digite em sequência três números inteiros : ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();

        soma = n1 + n2 + n3;
        aritmetica = soma/3;

        System.out.println("A soma dos três números é : " + soma + " " + "E a média aritmetica é : " + aritmetica);

    }
}