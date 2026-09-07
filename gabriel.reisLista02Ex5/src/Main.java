import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Olá, sou o convertor de temperatura Celsius. Caso deseje converter, primeiramente insira a temperatura em Celsius : ");
        double C = sc.nextDouble();
        System.out.println("Ótimo, a temperatura está em " + C + "°C . Ok, para qual meio de unidade você quer converter ?");
        System.out.println("Digite 1 para Fahrenheit ou Digite 2 para Kelvin : ");
        int uni = sc.nextInt();

        if (uni==1){

            System.out.print("Certo, o resultado em Fahrenheit é " + (C * 1.8 + 32));
        } else if (uni==2) {

            System.out.print("Certo, o resultado em Kelvin é " + (C + 273.15));
        } else{
            System.out.print("Opção invalida.");
        }

    }
}