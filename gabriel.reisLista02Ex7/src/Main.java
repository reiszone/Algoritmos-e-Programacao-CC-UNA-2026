import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Para darmos continuidade, precisamos verificar se você está apto para o financiamento.");
        System.out.print("Por favor, informe a sua renda mensal : R$");
        double renda = sc.nextDouble();
        double limite = renda * 0.7;

        System.out.print("Certo, agora informe qual o valor da prestação mensal que você deseja pagar no financiamento : R$");
        double prestacao = sc.nextDouble();

        if (prestacao>=3000 & renda<10000) {

            System.out.print("Financiamento negado por alta prestação");


        }else{
            if (prestacao>limite){
                System.out.print("Financiamento negado por baixa renda");

            }else{

                System.out.print("Financiamento aprovado");

            }
        }
    }
}