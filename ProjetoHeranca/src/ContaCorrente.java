public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(
            int numero,
            int agencia,
            String banco,
            double saldo,
            double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return super.toString() + " ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }

    public double getSaldo(){
        return this.chequeEspecial + this.saldo;
    }

    @Override
    public boolean saca(double valor){
        double limiteTotal = this.chequeEspecial + this.saldo;
        if (limiteTotal > 0 && limiteTotal >= valor  && valor > 0){
            this.saldo -= valor;
            return true;
        }
        else {
            System.err.println("O valor desejado é maior que o seu limite disponível");
            return false;
        }
    }

    public void deposita(double valor) {
        {this.saldo -= valor;}
    }
}

