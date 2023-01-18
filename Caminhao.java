package entidades;
public class Caminhao extends Veiculo {
    private int numeroEixos;
    private double cargaMaxima;
    

    public Caminhao(String placa, int ano, double valorDiaria,int numeroEixos, double cargaMaxima) {
        super(placa, ano, valorDiaria);
        this.numeroEixos = numeroEixos;
        this.cargaMaxima = cargaMaxima;
    }

    public int getNumeroEixos() {
        return this.numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public double getCargaMaxima() {
        return this.cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public Caminhao numeroEixos(int numeroEixos) {
        setNumeroEixos(numeroEixos);
        return this;
    }

    public Caminhao cargaMaxima(double cargaMaxima) {
        setCargaMaxima(cargaMaxima);
        return this;
    }
    @Override
    public String toString() {
        return super.toString()+"{" +
            " numeroEixos='" + getNumeroEixos() + "'" +
            ", cargaMaxima='" + getCargaMaxima() + "'" +
            "}";
    }
    
}
