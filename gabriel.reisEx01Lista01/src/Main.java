import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;
        double numerox2;

        System.out.print("Escolha um número : ");
        numero = sc.nextDouble();
        numerox2 = numero * 2;

        System.out.println("O dobro do seu número é : " + numerox2);

        }
    }