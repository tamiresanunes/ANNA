package entidades;
public abstract class Veiculo {

    private String placa;
    private int ano;
    private double valorDiaria;

    public Veiculo(String placa, int ano, double valorDiaria) {
        this.placa = placa;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorDiaria() {
        return this.valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Veiculo placa(String placa) {
        setPlaca(placa);
        return this;
    }

    public Veiculo ano(int ano) {
        setAno(ano);
        return this;
    }

    public Veiculo valorDiaria(double valorDiaria) {
        setValorDiaria(valorDiaria);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " placa='" + getPlaca() + "'" +
            ", ano='" + getAno() + "'" +
            ", valorDiaria='" + getValorDiaria() + "'" +
            "}";
    }
}
