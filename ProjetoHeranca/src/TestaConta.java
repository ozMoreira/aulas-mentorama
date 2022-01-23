public class TestaConta {

    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco AA", 100.00, 1000.00);
        System.out.println("O saldo da conta corrente é R$ " + cc1.getSaldo());

        ContaPoupanca cp1 = new ContaPoupanca(33, 3, "Banco CCC", 10.00, 20, 0.05);
        System.out.println("O saldo da conta poupança é R$ " + cp1.getSaldo());

        ContaSalario cs1 = new ContaSalario(44, 2, "Banco BBB", 10.00, 5, 3, 150.00, 0);
        cs1.getSaca();
        if (cs1.getSaqueDisponivel() == 0) {
            System.err.println("Voce nao terá mais saques disponíveis este mês!");
            System.out.println("Operação realizada com sucesso! Seu saldo restante é de R$" + String.format("%.2f", cs1.getSaldo()));
        } else if (cs1.getSaqueDisponivel() <= -1) {
                System.err.println("Voce estourou seu limite de saques no mês!\nNão será possível realizar a operação");
                System.out.println("Seu saldo é de R$" + String.format("%.2f", cs1.getSaldo()));
        }else{
                if (cs1.getSaldo() == 0.0) {
                    System.err.println("VOCE RETIROU TODO SEU DINHEIRO\nSeu Saldo agora é de R$ " + String.format("%.2f", cs1.getSaldo()));
                } else if (cs1.getSaldo() - cs1.getValorSaque() < 0) {
                    System.err.println("\nErro ao efetuar saque! Seu saldo de R$" + String.format("%.2f", cs1.getSaldo()) + " é menor do que o valor desejado para saque!");
                    System.out.println("Você ainda pode realizar " + cs1.getSaqueDisponivel() + " saque(s) neste mês");
                } else {
                    System.out.println("\nOperação realizada com sucesso!\nSeu Saldo agora é de R$ " + String.format("%.2f", cs1.getSaldo()) + "\nVocê ainda pode realizar " + cs1.getSaqueDisponivel() + " saque(s) neste mês");
                }
        }
    }

}
