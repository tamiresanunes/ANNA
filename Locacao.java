package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private int codigoLocacao;
    private boolean seguro;
    private Date dataInicial;
    private Date dataFinal;
    private static int numeroPadrao = 1000;


    public Locacao(Cliente cliente, Veiculo veiculo, int codigoLocacao, boolean seguro, Date dataInicial, Date dataFinal) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.codigoLocacao = numeroPadrao++;
        this.seguro = seguro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getCodigoLocacao() {
        return this.codigoLocacao;
    }

    public void setCodigoLocacao(int codigoLocacao) {
        this.codigoLocacao = codigoLocacao;
    }

    public int getCodigo() {
        return this.codigoLocacao;
    }

    public void setCodigo(int codigo) {
        this.codigoLocacao = codigo;
    }

    public boolean isSeguro() {
        return this.seguro;
    }

    public boolean getSeguro() {
        return this.seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public Date getDataInicial() {
        return this.dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return this.dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    @Override
    public String toString() {
        return "{" +
            " cliente='" + getCliente() + "'" +
            ", veiculo='" + getVeiculo() + "'" +
            ", codigoLocacao='" + getCodigoLocacao() + "'" +
            ", seguro='" + isSeguro() + "'" +
            ", dataInicial='" + getDataInicial() + "'" +
            ", dataFinal='" + getDataFinal() + "'" +
            "}";
    }
}