import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Olá, para que eu possa classificá-lo na competição preciso que insira a sua idade : ");
        int idade = sc.nextInt();

        if(idade<=12){
            System.out.print("Certo, você está na categoria infantil");
        }else if(idade<=17){
            System.out.print("Certo, você está na categoria juvenil");
        }else{
            System.out.print("Certo, você está na categoria adulto");
        }

        }
    }
