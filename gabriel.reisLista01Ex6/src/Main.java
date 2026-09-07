import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário (R$): ");
        double salarioAtual = sc.nextDouble(); //descobri agora que não precisa declarar a variável antes kkkkkkkkkk

        System.out.print("Digite a porcentagem de aumento (%): ");
        double porcentagemAumento = sc.nextDouble();

        double valorAumento = salarioAtual * (porcentagemAumento / 100);
        double novoSalario = salarioAtual + valorAumento;

        System.out.print("Pós reajuste, o salário atual do funcionário será de R$" + novoSalario);

        }
    }
