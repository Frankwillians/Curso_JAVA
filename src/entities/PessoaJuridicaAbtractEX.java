package entities;

public class PessoaJuridicaAbtractEX extends PessoaAbstractEX {
    private Integer numberOfEmployees;

    public PessoaJuridicaAbtractEX(){
        super();
    }

    public PessoaJuridicaAbtractEX(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public PessoaJuridicaAbtractEX(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double paidTax(){
        double tax = 0.0;
        if( getNumberOfEmployees() <= 10){
            tax = getAnualIncome() * 0.16;
        }
        if (getNumberOfEmployees() > 10) {
            tax = getAnualIncome() * 0.14;
        }

        return tax;
    }

    
}
