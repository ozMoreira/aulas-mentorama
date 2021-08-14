public class Alunos {

    private String aluno;
    private String data1;
    private String data2;
    private String data3;
    private String data4;


    public Alunos(String aluno,
                  String data1,
                  String data2,
                  String data3,
                  String data4){
        this.aluno = aluno;
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;

    }

    @Override
    public String toString(){
        return this.aluno + "  " + this.data1 + "  " + this.data2 + "  " + this.data3 + "  " + this.data4;
    }

}
