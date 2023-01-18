package entidades;
public class Cliente {
    private String nome;
    private long CPF; 
    private long CNH;
    private String endereco;
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, long CPF, long CNH, String endereco, String telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.CNH = CNH;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCPF() {
        return this.CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public long getCNH() {
        return this.CNH;
    }

    public void setCNH(long CNH) {
        this.CNH = CNH;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente nome(String nome) {
        setNome(nome);
        return this;
    }

    public Cliente CPF(long CPF) {
        setCPF(CPF);
        return this;
    }

    public Cliente CNH(long CNH) {
        setCNH(CNH);
        return this;
    }

    public Cliente endereco(String endereco) {
        setEndereco(endereco);
        return this;
    }

    public Cliente telefone(String telefone) {
        setTelefone(telefone);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", CPF='" + getCPF() + "'" +
            ", CNH='" + getCNH() + "'" +
            ", endereco='" + getEndereco() + "'" +
            ", telefone='" + getTelefone() + "'" +
            "}";
    }
    
}