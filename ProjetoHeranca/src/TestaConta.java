public class TestaConta {

    public static void main(String[] args) {
        System.out.println("\n");
        Conta[] vContas = new Conta[3];

        ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco AA", 100.00, 1000.00);
        ContaPoupanca cp1 = new ContaPoupanca(33, 1, "Banco AA", 10.00, 26, 0.05);
        ContaSalario cs1 = new ContaSalario(44, 1, "Banco AA", 10.00, 5);


        vContas[0] = cc1;
        vContas[1] = cp1;
        vContas[2] = cs1;

        cc1.saca(1200.00);
        cp1.saca(20.00);
        cs1.saca(1.00);
        cs1.saca(1.00);
        cs1.saca(1.00);
        cs1.saca(1.00);
        cs1.saca(1.00);
        cs1.saca(1.00);

        System.out.println("--------------------------------------");
        System.out.println("Consultando as contas do cliente XPTO");
        System.out.println("--------------------------------------");
        System.out.println("");
        for (Conta daVez : vContas){
            System.out.println("");
            System.out.println(daVez);
            System.out.println("Saldo: R$ " + daVez.getSaldo());
            System.out.println("--------------------------------------");
        }
    }

}
