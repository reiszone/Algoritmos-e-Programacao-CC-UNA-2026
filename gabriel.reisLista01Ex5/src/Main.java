import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura;
        double peso;
        double quadradoaltura;
        double imc;

        System.out.print("Responda respectivamente qual é : A sua altura em metros, O seu peso em Kg : ");
        altura = sc.nextDouble(); peso = sc.nextDouble();
        quadradoaltura = altura * altura;
        imc = peso / quadradoaltura;

        System.out.println("O seu resultado do calculo do IMC peso/altura² é : " + imc );

    }
}