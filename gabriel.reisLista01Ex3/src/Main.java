import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double idadeano;
        double idademes;

        System.out.println("Qual a sua idade ? ");
        idadeano = sc.nextDouble();
        idademes = idadeano * 12;

        System.out.println("Boa, você tem " + idademes + " meses de vida");

        }
    }
