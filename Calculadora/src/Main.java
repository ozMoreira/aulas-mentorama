import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            calc.ChamaMenu();
            opcao = sc.nextInt();

            calc.Processa(opcao);
        } while (opcao != 0);






    }
}
