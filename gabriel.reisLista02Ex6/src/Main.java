import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o código e a quantidade do produto que você está comprando : ");
        int cod = sc.nextInt(); int quant = sc.nextInt();

        if (quant>0){
            if (cod > 1 & cod<=10){
            double produt = 10;
            double nota = produt * quant;

            if (nota>=250){
               double desconto = 0.95;
               double notaf = nota * desconto;

                System.out.print("Certo, então o preço final de sua nota é de : R$" + nota + " Mas você recebeu um desconto de " + desconto + "% . Por isso, o preço agora é de : R$" + notaf);


            } else if (nota<250 & nota<=500){
                double desconto = 0.90;
                double notaf = nota * desconto;

                System.out.print("Certo, então o preço final de sua nota é de : R$" + nota + " Mas você recebeu um desconto de " + desconto + "% . Por isso, o preço agora é de : R$" + notaf);


            } else{
                double desconto = 0.85;
                double notaf = nota * desconto;

                System.out.print("Certo, então o preço final de sua nota é de : R$" + nota + " Mas você recebeu um desconto de " + desconto + "% . Por isso, o preço agora é de : R$" + notaf);


            }}else if (cod > 10 & cod<=20) {
            double produt = 15;
            double nota = produt * quant;

            if (nota>=250){
                double desconto = 0.95;
                double notaf = nota * desconto;

                System.out.print("Certo, então o preço final de sua nota é de : R$" + nota + " Mas você recebeu um desconto de " + desconto + "% . Por isso, o preço agora é de : R$" + notaf);


            } else if (nota<250 & nota<=500){
                double desconto = 0.90;
                double notaf = nota * desconto;

                System.out.print("Certo, então o preço final de sua nota é de : R$" + nota + " Mas você recebeu um desconto de " + desconto + "% . Por isso, o preço agora é de : R$" + notaf);


            } else{
                double desconto = 0.85;
                double notaf = nota * desconto;

                System.out.print("Certo, então o preço final de sua nota é de : R$" + nota + " Mas você recebeu um desconto de " + desconto + "% . Por isso, o preço agora é de : R$" + notaf);


            }

        } else if (cod > 20 & cod<=30) {
            double produt = 20;
            double nota = produt * quant;

            if (nota>=250){
                double desconto = 0.95;
                double notaf = nota * desconto;

                System.out.print("Certo, então o preço final de sua nota é de : R$" + nota + " Mas você recebeu um desconto de " + desconto + "% . Por isso, o preço agora é de : R$" + notaf);


            } else if (nota<250 & nota<=500){
                double desconto = 0.90;
                double notaf = nota * desconto;

                System.out.print("Certo, então o preço final de sua nota é de : R$" + nota + " Mas você recebeu um desconto de " + desconto + "% . Por isso, o preço agora é de : R$" + notaf);


            } else{
                double desconto = 0.85;
                double notaf = nota * desconto;

                System.out.print("Certo, então o preço final de sua nota é de : R$" + nota + " Mas você recebeu um desconto de " + desconto + "% . Por isso, o preço agora é de : R$" + notaf);


            }

        } else if (cod > 30 & cod<=40) {
            double produt = 30;
            double nota = produt * quant;

            if (nota>=250){
                double desconto = 0.95;
                double notaf = nota * desconto;

                System.out.print("Certo, então o preço final de sua nota é de : R$" + nota + " Mas você recebeu um desconto de " + desconto + "% . Por isso, o preço agora é de : R$" + notaf);


            } else if (nota<250 & nota<=500){
                double desconto = 0.90;
                double notaf = nota * desconto;

                System.out.print("Certo, então o preço final de sua nota é de : R$" + nota + " Mas você recebeu um desconto de " + desconto + "% . Por isso, o preço agora é de : R$" + notaf);


            } else{
                double desconto = 0.85;
                double notaf = nota * desconto;

                System.out.print("Certo, então o preço final de sua nota é de : R$" + nota + " Mas você recebeu um desconto de " + desconto + "% . Por isso, o preço agora é de : R$" + notaf);


            }

    }else if (cod>=0){
            System.out.print("Código invalido");
        } else{
            System.out.print("Código invalido");

}
}else{
            System.out.print("Quantidade invalida");
        }
    }}