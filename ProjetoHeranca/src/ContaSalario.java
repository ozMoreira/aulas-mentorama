public class ContaSalario extends Conta {

    private int limiteSaque;
    private int saqueDisponivel;
    private double valorSaque;
    private double transacao;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int limiteSaque, int saqueDisponivel, double valorSaque, double transacao) {
        super(numero, agencia, banco, saldo);
        this.limiteSaque = limiteSaque;
        this.saqueDisponivel = saqueDisponivel;
        this.valorSaque = valorSaque;
        this.transacao = transacao;

    }
    public double getSaqueDisponivel() {
        //if (this.saqueDisponivel >=1 && this.saqueDisponivel <= this.limiteSaque){
           // this.getSaca();
            return this.saqueDisponivel;
      //  }
       // return 0;
    }

    public void setSaqueDisponivel(int saqueDisponivel) {
        this.saqueDisponivel = saqueDisponivel;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    public double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public double getTransacao() {
        return transacao;
    }

    public void setTransacao(double transacao) {
        this.transacao = transacao;
    }

    public double getSaca(){
        if (this.saldo > 0 && this.saldo >= this.valorSaque  && this.valorSaque > 0 && this.saqueDisponivel > 0){
            this.transacao = this.saldo - this.valorSaque;
            this.saldo = this.transacao;
            setSaqueDisponivel(saqueDisponivel-1);
            return this.saldo;
        }
        return 0;

    }

    @Override
    public double getDeposita() {
        return 0;
    }

}
