package entities;

public class PessoaFisicaAbstractEX extends PessoaAbstractEX {
    private Double healthExpenses;

    public PessoaFisicaAbstractEX(){
        super();
    }

    public PessoaFisicaAbstractEX(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    public PessoaFisicaAbstractEX(String name, Double anualIncome, Double healthExpenses) {
        super(name, anualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double paidTax(){
        double tax = 0.0;
        double total = 0.0;
        if( getAnualIncome() < 20000){
            tax = getAnualIncome() * 0.15;
        }
        if (getAnualIncome() >= 20000) {
            tax = getAnualIncome() * 0.25;
        }

        if (getHealthExpenses()>0){
            total = (tax-(getHealthExpenses()*0.5));
        }else{
            total = tax;
        }
        return total;
    }


    

    
}
