import java.util.Scanner;

public class Calculadora {

    public static void ChamaMenu(){

        System.out.println("\n\n ---- CALCULADORA SIMPLES ---- "+
                "\n\n1 - SOMAR"+
                "\n2 - SUBTRAIR"+
                "\n3 - MULTIPLICAR"+
                "\n4 - DIVIDIR"+
                "\n0 - SAIR");

        System.out.print("\n INFORME A OPÇÃO DESEJADA >>> ");
    }

    public static void SomaNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSoma Dois Numeros");

        System.out.print("Informe o primeiro numero >>> ");
        int n1 = sc.nextInt();
        System.out.print("Informe o segundo numero >>> ");
        int n2 = sc.nextInt();
        int resultado = n1 + n2;
        System.out.println("\n\n1Resultado: " + resultado);
    }

    public static void Subtrai(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSubtraindo Dois Numeros");

        System.out.print("Informe o primeiro numero >>> ");
        int n1 = sc.nextInt();
        System.out.print("Informe o segundo numero >>> ");
        int n2 = sc.nextInt();
        int resultado = n1 - n2;
        System.out.println("\n\n1Resultado: " + resultado);
    }
    public static void Divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDivisão de Dois Numeros");

        System.out.print("Informe o primeiro numero >>> ");
        double n1 = sc.nextInt();
        System.out.print("Informe o segundo numero >>> ");
        double n2 = sc.nextInt();
        if (n2 == 0){
            System.out.println("IMPOSSIVEL DIVIDIR POR 0!");
        } else {
            double resultado = n1 / n2;
            System.out.println("\n\n1Resultado: " + resultado);
        }

    }
    public static void Multiplica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMultiplica Dois Numeros");

        System.out.print("Informe o primeiro numero >>> ");
        int n1 = sc.nextInt();
        System.out.print("Informe o segundo numero >>> ");
        int n2 = sc.nextInt();
        int resultado = n1 * n2;
        System.out.println("\n\n1Resultado: " + resultado);
    }
    public static void Processa(int opcao){
        switch (opcao){
            case 1:{
                SomaNumeros();
                break;
            }
            case 2:{
                Subtrai();
                break;
            }
            case 3:{
                Multiplica();
                break;
            }
            case 4:{
                Divide();
                break;
            }
        }
    }


}
