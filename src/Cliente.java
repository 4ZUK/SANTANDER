public class Cliente {
    private int numeroCliente;
    private String CPF;
    private String Sobrenome;
    private int RG;



    public Cliente(String Sobrenome,String CPF,int numeroCliente, int RG){
        this.Sobrenome=Sobrenome;
        this.CPF = CPF;
        this.numeroCliente=numeroCliente;
        this.RG = RG;
    }

////////////// GLOBAL ///////////////////

public Cliente(){}

////////// GETS /////////////////////

    public String getSobrenome(){
        return Sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getnumeroCliente() {
        return numeroCliente;
    }

    public int getRG() {
        return RG;
    }

    ////////// SET /////////////

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSobrenome(String novoSobrenome) {
        this.Sobrenome = novoSobrenome;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

}