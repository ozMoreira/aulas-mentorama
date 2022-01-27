import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ContaPoupanca extends Conta{
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(
            int numero,
            int agencia,
            String banco,
            double saldo,
            int diaAniversario,
            double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getSaldo(){
        Calendar data =  Calendar.getInstance();
        SimpleDateFormat dia = new SimpleDateFormat("dd");
        if (Integer.parseInt(dia.format(data.getTime())) == diaAniversario){
            return this.saldo + this.taxaDeJuros * this.saldo;
        } else return this.saldo;
    }

    @Override
    public boolean saca(double valor){
        if (this.saldo > 0 && this.saldo >= valor  && valor > 0){
            this.saldo -= valor;
            return true;
        }
        else {
            System.err.println("O valor desejado é maior que o seu Saldo em sua conta");
            return false;
        }
    }
    @Override
    public void deposita(double valor) {
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return super.toString() + " ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }
}
