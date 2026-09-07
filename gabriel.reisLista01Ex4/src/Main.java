import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double produto;
        double produtocomdesconto;

        System.out.print(" Qual o valor deste produto ? ");
        produto = sc.nextDouble();

        produtocomdesconto = produto * 0.9;

        System.out.println("O seu produto recebeu 10% de desconto, sendo assim, o valor dele passa a ser : " + produtocomdesconto);

        }
    }
