import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Olá, sou o calculador de sua conta de energia. Insira por favor a quantidade de kWh consumidos : ");
        int kwh = sc.nextInt();

        if (kwh <=100){
            double conta = kwh * 0.50;
            System.out.print("O valor de sua conta será de : " + conta);
        }else if(kwh<=200){
            double conta = kwh * 0.70;
            System.out.print("O valor de sua conta será de : " + conta);
        }else{
            double conta = kwh * 0.90;
            System.out.print("O valor de sua conta será de : " + conta);
        }
        }
    }
