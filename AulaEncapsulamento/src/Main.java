public class Main {

    public static void main (String... args){
        Carro carro = new Carro(4, 2,4, 2, 2, 5);
        carro.setCor(Carro.VERMELHO);
        carro.setTipoAcabamentoInterno(Carro.tpAcabamentoInterno1);
        carro.setTipoEstofamento(Carro.tpEstofado2);
        carro.imprimiVenda();
    }
}
