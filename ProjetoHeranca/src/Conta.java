public abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;

    public Conta(int numero, int agencia, String banco, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", banco='" + banco + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public abstract double getSaldo();

    public abstract boolean saca(double valor);

    public void deposita(double valor){this.saldo -= valor;}

}
