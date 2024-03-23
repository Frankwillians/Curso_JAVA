package application;

import entities.BusinessAccountHerancaEX;
import entities.SavingAccountHerancaEX;
import entities.AccountHerancaEX;

public class UpcastingDowncastingEX {
    public static void main(String[] args) {
        
        AccountHerancaEX acc = new AccountHerancaEX(1001, "Alex", 0.0);
        BusinessAccountHerancaEX bacc = new BusinessAccountHerancaEX(1002, "Maria", 0.0, 500.0);

        //UPCASTING

        AccountHerancaEX acc1 = bacc;
        AccountHerancaEX acc2 = new BusinessAccountHerancaEX(1003, "Bob", 0.0, 200.0);
        AccountHerancaEX acc3 = new SavingAccountHerancaEX(1004,"Maria", 0.0, 0.01);

        //DOWNCASTING


        //fazendo o downcasting para o tipo businessaccount
        BusinessAccountHerancaEX acc4 = (BusinessAccountHerancaEX)acc2;
        acc4.loan(100);
        // da erro por que o compilador não sabe diferenciar então cabe ao progamador evitar este tipo de erro. 
        //BusinessAccountHerancaEX acc5 = (BusinessAccountHerancaEX)acc3;
        
        //para conferir se um objeto é da classe que foi feita o downcasting se utiliza a o instance of, como feito a baixo.
        if(acc3 instanceof BusinessAccountHerancaEX){
            BusinessAccountHerancaEX acc5 = (BusinessAccountHerancaEX)acc3;
            acc5.loan(200);
            System.out.println("Loan");
        }
        if(acc3 instanceof SavingAccountHerancaEX){
            SavingAccountHerancaEX acc5 = (SavingAccountHerancaEX)acc3;
            acc5.updateBalance();
            System.out.println("update");

        }

    }
}
