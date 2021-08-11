import java.util.Scanner;

public class Endereco {

    public static void main (String[] args){
        System.out.println("------------ Cadastro de Usuario ------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.print("Informe a rua:  ");
        String rua = scanner.nextLine();
        System.out.print("Informe o numero da residencia:  ");
        String nro = scanner.nextLine();
        System.out.print("Informe o Bairro:  ");
        String bairro = scanner.nextLine();
        System.out.print("Informe a cidade:  ");
        String cidade = scanner.nextLine();
        System.out.print("Informe a UF:  ");
        String uf = scanner.nextLine();
        System.out.print("Informe o CEP:  ");
        String cep = scanner.nextLine();

        System.out.println("\n---------- Dados Cadastrados  ---------- " +
                        "\nNome completo: " + nome +
                        "\nEndereço: " + rua + ", " + nro + " - " + bairro +
                        "\n"+ cidade + " - " + uf +
                        "\nCEP: " + cep
                        );

    }
}
