package entities;

public class BusinessAccountHerancaEX extends AccountHerancaEX {
    private Double loanLimit;

    public BusinessAccountHerancaEX(){
        super();
    }

    public BusinessAccountHerancaEX(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    
    public void loan(double ammount){
        if (ammount <= loanLimit){
            deposit(ammount);
        }
    }

}
