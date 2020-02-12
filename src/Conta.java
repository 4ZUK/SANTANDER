public class Conta extends Cliente {
    private double Deposito;
    private double Sacar;
    private String Consulta;
    private double Juros;
    private double valJuros;
    private double saldoTotal;
//    private double contaPoup;
//    private double contaCC;

    public Conta(double deposito, String consulta, double juros, double valJuros, double saldoTotal) {
        this.Deposito = deposito;
        this.Consulta = consulta;
        this.Juros = juros;
        this.valJuros = valJuros;
        this.saldoTotal = saldoTotal;
//        this.contaCC = contaCC;
//        this.contaPoup = contaPoup;

    }

    ////////////////////////////////////////////////////////
    public void novaConta(Cliente Patrick, Conta conta1) {
        System.out.println("******** Banco Santander S.A Extrato Cliente******");
        System.out.println("Patrick " + Patrick.getSobrenome());
        System.out.println("CPF:" + Patrick.getCPF());
        System.out.println("ID Do Cliente: " + Patrick.getnumeroCliente());
        System.out.println("RG Do Cliente: " + Patrick.getRG());
        System.out.println("Saldo Total (Com Juros)" + conta1.saldoTotal);
        System.out.println("Juros ao mes: " + conta1.getJuros(0));
        System.out.println("Saldo sem juros: " + conta1.getValJuros());
        System.out.println("Ultimo Deposito CC: " + conta1.getDeposito());
        System.out.println("Ultimo Saque CC:" + conta1.getSacar());
        System.out.println("******* SANTANDER S.A AGRADEÇE A SUA ESCOLHA****");
    }


    //////////////////////////////////////////////////////
    public double getDeposito() {
        return this.Deposito;
    }

    public void setDeposito(double deposito) {
        this.Deposito = deposito;
    }

    public double getSacar() {
        return this.Sacar;
    }

    public void setSacar(double sacar) {
        this.Sacar = sacar;
    }


    public double getJuros(double Juros) {

        return this.Juros;
    }

    public void setJuros(double juros) {
        if (this.saldoTotal >= 0) {
            this.saldoTotal = (this.saldoTotal * 4.2);
        }
    }

    public double getValJuros() {
        return this.valJuros;
    }

    public void setValJuros(double valJuros) {
        this.valJuros = valJuros;
    }

    public double getSaldoTotal() {
        return this.saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
}



