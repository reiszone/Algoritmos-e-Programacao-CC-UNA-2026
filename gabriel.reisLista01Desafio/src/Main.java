import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Escolha dois números inteiros. Um para A e outro para B (respectivamente) : ");
            int A = sc.nextInt(); int B = sc.nextInt();

            int C = A;
            A = B;
            B = C;

        System.out.print("Se invertemos, A vira : " + A + " E B vira : " + B);


        }
    }
