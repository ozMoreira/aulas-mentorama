import java.util.LinkedList;
import java.util.List;

public class DiarioChamada {

    public static void main (String[] args){

        Alunos oswaldo = new Alunos(
                "Oswaldo",
                "Presente",
                "Presente",
                "Presente",
                "Presente");

        Alunos pedro = new Alunos(
                "Pedro  ",
                "Presente",
                "Faltou  ",
                "Presente",
                "Faltou  ");

        Alunos joao = new Alunos(
                "Joao   ",
                "Faltou  ",
                "Faltou  ",
                "Presente",
                "Presente");

        List<Alunos> listaAlunos = new LinkedList<>();
        listaAlunos.add(oswaldo);
        listaAlunos.add(pedro);
        listaAlunos.add(joao);

        System.out.println("\n\n       |  01/08   |  02/08  |  03/08   |  04/08  |");
        for(Alunos aluno: listaAlunos){
            System.out.println(aluno);
        }





    }
}
