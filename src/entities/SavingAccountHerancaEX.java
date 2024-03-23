package entities;

public final class SavingAccountHerancaEX extends AccountHerancaEX{
    private Double interestRate;

    public SavingAccountHerancaEX(){
        super();
    }

    public SavingAccountHerancaEX(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }
    @Override //serve pra indicar para o compilador que é uma sobreposição de metodo
    public void withdraw(Double ammount){
        balance -= ammount;
    }

}
