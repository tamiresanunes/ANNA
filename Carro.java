package entidades;
public class Carro extends Veiculo{
    private int numeroPassageiros;
    private int  numeroPortas;
    public Carro(String placa, int ano, double valorDiaria, int numeroPortas) {
        super(placa, ano, valorDiaria);
        this.numeroPortas = numeroPortas;
    }

    private float mediaKmL;
    private boolean arCondicionado;

    public Carro(String placa, int ano, double valorDiaria){
        super(placa, ano, valorDiaria);
    }

    public Carro(String placa, int ano, double valorDiaria, int numeroPassageiros, int numeroPortas, float mediaKmL, boolean arCondicionado){
        super(placa, ano, valorDiaria);
        this.numeroPassageiros = numeroPassageiros;
        this.numeroPortas = numeroPortas;
        this.mediaKmL = mediaKmL;
        this.arCondicionado = arCondicionado;
    }

    public int getNumeroPassageiros(){return numeroPassageiros;}
    public int getNumeroPortas(){return numeroPortas;}
    public float getMediaKmL(){return mediaKmL;}
    public boolean getArCondicionado(){return arCondicionado;}

    public void setNumeroPassageiros(int numeroPassageiros){this.numeroPassageiros = numeroPassageiros;}
    public void setNumeroPortas(int numeroPortas){this.numeroPortas = numeroPortas;}
    public void setMediaKmL(float mediaKmL){this.mediaKmL = mediaKmL;}
    public void setArCondicionado(boolean arCondicionado){this.arCondicionado = arCondicionado;}

    public String toString(){
        return super.toString()+ "{" +
            " numeroPassageiros='" + getNumeroPassageiros() + "'" +
            ", numeroPortas='" + getNumeroPortas() + "'" +
            ", mediaKmL='" + getMediaKmL() + "'" +
            ", arCondicionado='" + getArCondicionado() + "'" +
            "}";
    }
}
