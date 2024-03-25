package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaAbstractEX;
import entities.PessoaFisicaAbstractEX;
import entities.PessoaJuridicaAbtractEX;

public class appPessoaAbstract {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<PessoaAbstractEX> pessoas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax Payers: ");
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            
          
            System.out.println("Tax Payer #" + (i+1) + " data:");
            System.out.print("Individual or company (i/c) ? ");
            String resp = sc.next();
            System.out.print("name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (resp.equals("i")) {
                System.out.print("Health expenditures: ");
                double healthExpenses = sc.nextDouble();
                pessoas.add(new PessoaFisicaAbstractEX(name, anualIncome, healthExpenses));
            }
            if (resp.equals("c")){
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                pessoas.add(new PessoaJuridicaAbtractEX(name, anualIncome, numberOfEmployees));
            }


        }
        double totalTax = 0.0;
        System.out.println("TAXES PAID: ");
        for (PessoaAbstractEX pessoa : pessoas) {
            System.out.println(pessoa.getName() + ": $ " + String.format("%.2f", pessoa.paidTax()));
            totalTax += pessoa.paidTax();
        }

        System.out.print("TOTAL TAX: $ ");
        System.out.println(totalTax);

        sc.close();
    }
}
