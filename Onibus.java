package entidades;
public class Onibus extends Veiculo{
    private int numeroPassageiros;
    private String categoria;
    private boolean internet;
    private boolean arCondicionado;

    public Onibus(String placa, int ano, double valorDiaria){
        super(placa, ano, valorDiaria);
    }

    public Onibus(String placa, int ano, double valorDiaria, int numeroPassageiros, String categoria, boolean internet, boolean arCondicionado){
        super(placa, ano, valorDiaria);
        this.numeroPassageiros = numeroPassageiros;
        this.categoria = categoria;
        this.internet = internet;
        this.arCondicionado = arCondicionado;
    }

    public int getNumeroPassageiros(){return numeroPassageiros;}
    public String getCategoria(){return categoria;}
    public boolean getInternet(){return internet;}
    public boolean getArCondicionado(){return arCondicionado;}

    public void setNumeroPassageiros(int numeroPassageiros){this.numeroPassageiros = numeroPassageiros;}
    public void setCategoria(String categoria){this.categoria = categoria;}
    public void setInternet(boolean internet){this.internet = internet;}
    public void setArCondicionado(boolean arCondicionado){this.arCondicionado = arCondicionado;}

    public String toString(){
        return super.toString()+ "{" +
            " numeroPassageiros='" + getNumeroPassageiros() + "'" +
            ", categoria='" + getCategoria() + "'" +
            ", internet='" + getInternet() + "'" +
            ", arCondicionado='" + getArCondicionado() + "'" +
            "}";
    }
}