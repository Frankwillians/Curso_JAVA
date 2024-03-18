package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevelex;

public class Workerex {
    private String name;
    private WorkerLevelex level;
    private Double baseSalary;

    private Department department;
    private List<HourContractex> contracts = new ArrayList<>();

    public Workerex(){

    }

    public Workerex(String name, WorkerLevelex level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevelex getLevel() {
        return level;
    }

    public void setLevel(WorkerLevelex level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContractex> getContracts() {
        return contracts;
    }

    
    public void addContract(HourContractex contract){
        contracts.add(contract);
    }
    public void removeContract (HourContractex contract){
        contracts.remove(contract);
    }

    public double income (int year , int month){
        double sum = baseSalary;
         //pegar partes especificas da data
        Calendar cal = Calendar.getInstance();
        for(HourContractex c : contracts){
           //pegar partes especificas da data
            cal.setTime(c.getDate());
            int c_year =  cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
