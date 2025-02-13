public class ContaCliente {
    private String name;
    private double depositoInicial;
    private double chequeEspecial;
    private double creditoEspecial;
    private double saldoTotal;

    public ContaCliente() {
    }

    // ------------- Métodos e lógica do negócio -------------------

    public void calculaValorChequeEspecial() {
        if (depositoInicial <= 500) {
            chequeEspecial = 50.0;
        } else {
            chequeEspecial = (depositoInicial / 2);
        }
    }

    public void calculaSaldoTotal() {
        calculaValorChequeEspecial();
        saldoTotal = getDepositoInicial() + getChequeEspecial();
        setSaldoTotal(saldoTotal);
    }

    public void verificaUsoDoChequeEspecial() {
        if (saldoTotal < chequeEspecial) {
            creditoEspecial = saldoTotal;
            System.out.println("Insuficiencia de saldo. A utilizar cheque especial! Usaste " + (chequeEspecial - creditoEspecial) + " do seu Cheque Especial.");
        } else {
            System.out.println("Ainda tens " + (saldoTotal - chequeEspecial) + " de saldo" + " + " + chequeEspecial + " de cheque especial.");
        }
        calculaJurosChequeEspecial();
    }

    public void depositaDinheiro(double deposito) {
        setSaldoTotal(saldoTotal + deposito);
        System.out.println("Fez um depósito de " + deposito + ", seu saldo atual é de: " + saldoTotal);
    }

    public void sacaDinheiro(double saque) {
        setSaldoTotal(saldoTotal - saque);
        System.out.println("Fez um saque de " + saque + ", seu saldo atual é de: " + saldoTotal);
    }

    public void pagaBoleto(double pagamento) {
        setSaldoTotal(saldoTotal - pagamento);
        System.out.println("Pagou o boleto de " + pagamento + ", seu saldo atual é de: " + saldoTotal);
    }

    public void consultaChequeEspecial() {
        if (saldoTotal < chequeEspecial) {
            creditoEspecial = saldoTotal;
            System.out.println("Total de cheque especial: " + creditoEspecial);
        } else {
            creditoEspecial = chequeEspecial;
            System.out.println("Total de cheque especial: " + creditoEspecial);
        }

    }

    public void calculaJurosChequeEspecial() {
        double juros;
        if (saldoTotal < chequeEspecial) {
            juros = (chequeEspecial - creditoEspecial) * 0.2;
            System.out.println("Taxa de Juros sob cheque especial: " + juros);
        } else {
            System.out.println("Não tens nada a pagar de juros.");
        }
    }



    // GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
        calculaValorChequeEspecial();
        System.out.println("Seu deposito inicial foi de: " + depositoInicial);

    }

    private void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

}
