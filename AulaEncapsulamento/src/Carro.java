public class Carro {

    public static final String VERMELHO = "vermelho";
    public static final String PRETO = "preto";
    public static final String tpEstofado1 = "Couro Preto";
    public static final String tpEstofado2 = "Couro Marrom";
    public static final String tpAcabamentoInterno1 = "Carvalho";
    public static final String tpAcabamentoInterno2 = "Fibra de Carbono";

    private Integer qtdPneus;
    private Integer qtdCalotas;
    private Integer qtdParafusosPneu;
    private Integer qtdPortas;
    private Integer qtdFarois;
    private Integer qtdLampadas;
    private Integer qtdPiscaAlerta;
    private Integer qtdParachoque;
    private Integer qtdVidros;
    private Integer qtdRetrovisores;
    private Integer qtdAssentos;
    private Integer qtdEspelhos;
    private String tipoEstofamento;
    private String cor;
    private String tipoAcabamentoInterno;

    public Carro (Integer qtdPneus,
                  Integer qtdPortas,
                  Integer qtdFarois,
                  Integer qtdParachoque,
                  Integer qtdRetrovisores,
                  Integer qtdAssentos){
        setQtdPneus(qtdPneus);
        setQtdPortas(qtdPortas);
        setQtdFarois(qtdFarois);
        setQtdParachoque(qtdParachoque);
        setQtdRetrovisores(qtdRetrovisores);
        setQtdAssentos(qtdAssentos);
    }

     public Integer getQtdPneus(){
        return qtdPneus + 1;
    }

    public void setQtdPneus(Integer qtdPneus){
        setQtdCalotas(qtdPneus);
        setQtdParafusosPneu(qtdPneus);
        this.qtdPneus = qtdPneus;
    }

    public Integer getQtdCalotas() {
        return qtdCalotas;
    }

    public void setQtdCalotas(Integer qtdCalotas) {
        this.qtdCalotas = qtdCalotas;
    }

    public Integer getQtdParafusosPneu() {
        return qtdParafusosPneu;
    }

    public void setQtdParafusosPneu(Integer qtdParafusosPneu) {
        this.qtdParafusosPneu = qtdParafusosPneu * 4 ;
    }

    public Integer getQtdPortas() {
        return qtdPortas +1;
    }

    public void setQtdPortas(Integer qtdPortas) {
        setQtdVidros(qtdPortas);
        this.qtdPortas = qtdPortas;
    }

    public Integer getQtdVidros() {
        return qtdVidros;
    }

    public void setQtdVidros(Integer qtdVidros) {
        this.qtdVidros = qtdVidros+2;
    }

    public Integer getQtdFarois() {
        return qtdFarois;
    }

    public void setQtdFarois(Integer qtdFarois) {
        this.qtdFarois = qtdFarois;
    }

    public Integer getQtdParachoque() {
        return qtdParachoque;
    }

    public void setQtdParachoque(Integer qtdParachoque) {
        setQtdPiscaAlerta(qtdParachoque);
        this.qtdParachoque = qtdParachoque;
    }


    public Integer getQtdPiscaAlerta() {
        return qtdPiscaAlerta;
    }

    public void setQtdPiscaAlerta(Integer qtdPiscaAlerta) {
        this.qtdPiscaAlerta = qtdPiscaAlerta * 2;
    }

    public Integer getQtdLampadas() {
        return qtdLampadas = getQtdFarois() + getQtdPiscaAlerta();
    }

    public void setQtdLampadas(Integer qtdLampadas) {
        this.qtdLampadas = qtdLampadas;
    }

    public Integer getQtdRetrovisores() {
        return qtdRetrovisores;
    }

    public void setQtdRetrovisores(Integer qtdRetrovisores) {
        setQtdEspelhos(qtdRetrovisores);
        this.qtdRetrovisores = qtdRetrovisores;
    }

    public Integer getQtdEspelhos() {
        return qtdEspelhos;
    }

    public void setQtdEspelhos(Integer qtdEspelhos) {
        this.qtdEspelhos = qtdEspelhos +1;
    }

    public Integer getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(Integer qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    public String getTipoEstofamento() {
        return tipoEstofamento;
    }

    public void setTipoEstofamento(String tipoEstofamento) {
        this.tipoEstofamento = tipoEstofamento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoAcabamentoInterno() {
        return tipoAcabamentoInterno;
    }

    public void setTipoAcabamentoInterno(String tipoAcabamentoInterno) {
        this.tipoAcabamentoInterno = tipoAcabamentoInterno;
    }

    public void imprimiVenda(){
        System.out.println(
                "----------- ITENS DE SERIE ----------- \n"+
                        "Quantidade de Pneus = " +  getQtdPneus() + "\n" +
                        "Quantidade de Calotas = " + getQtdCalotas() + "\n" +
                        "Quantidade de Parafuso do Pneu = " +  getQtdParafusosPneu() + "\n" +
                        "Quantidade de Portas = " +  getQtdPortas() + "\n" +
                        "Quantidade de Farois = " +  getQtdFarois() + "\n" +
                        "Quantidade de Pisca Alerta = " +  getQtdPiscaAlerta() + "\n" +
                        "Quantidade de Lampadas = " + getQtdLampadas() + "\n" +
                        "Quantidade de Parachoque = " +  getQtdParachoque() + "\n" +
                        "Quantidade de Vidros = " +  getQtdVidros() + "\n" +
                        "Quantidade de Retrovisores = " +  getQtdRetrovisores() + "\n" +
                        "Quantidade de Espelhos = " +  getQtdEspelhos() + "\n" +
                        "Quantidade de Assentos = " +  getQtdAssentos() + "\n" +
                        "\n----------- ITENS OPCIONAIS -----------\n"+
                        "Cor do Veículo = " +  getCor() + "\n" +
                        "Tipo do Estofamento = " +  getTipoEstofamento() + "\n" +
                        "Tipo de Acabamento Interno = " +  getTipoAcabamentoInterno()
        );
    }
}
