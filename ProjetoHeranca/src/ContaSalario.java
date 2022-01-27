public class ContaSalario extends Conta {

    private int limiteSaque;

    public ContaSalario(
            int numero,
            int agencia,
            String banco,
            double saldo,
            int limiteSaque) {
        super(numero, agencia, banco, saldo);
        this.limiteSaque = limiteSaque;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public boolean saca(double valor){
        if (this.saldo > 0 && this.saldo >= valor  && valor > 0 && this.limiteSaque > 0){
            this.saldo -= valor;
            this.limiteSaque--;
            return true;
        } else if (this.limiteSaque <= 0 ) {
            System.err.println("Voce já atingiu o limite de saques disponiveis para este mês!");
            return false;
        } else {
            System.err.println("O valor desejado para saque é maior que o seu saldo em conta!");
            return false;
        }
    }

    @Override
    public void deposita(double valor) {
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return super.toString() + " ContaSalario{" +
                "limiteSaque=" + limiteSaque +
                '}';
    }
}
