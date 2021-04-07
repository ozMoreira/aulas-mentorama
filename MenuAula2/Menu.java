import java.util.Scanner;

public class Menu {

	  public static void main (String [] args) {
	        
	        Scanner menu = new Scanner(System.in);

	        while (true) {

	        System.out.println("|    MENU                    |");
	        System.out.println("|  Opcoes:                   |");
	        System.out.println("|         1. Opcao 1         |");
	        System.out.println("|         2. Opcao 2         |");
	        System.out.println("|         3. Sair            |");
	        System.out.println("Selecione uma opcaoo: ");
	        
	        int opcao = menu.nextInt();
	 
	        if (opcao == 3){
	            System.out.println("O programa foi encerrado");
	            menu.close();
	            break;
	        }
	        switch (opcao) {
	          case 1:
	            System.out.println("Voce escolheu a primeira op��o");
	            break;
	              
	          case 2:
	            System.out.println("Voce escolheu a segunda op��o");
	            break;

	          default:
	            System.out.println("Escolha uma op��o v�lida em nosso menu");
	            break;
	          }
	        }
	    } 
}
