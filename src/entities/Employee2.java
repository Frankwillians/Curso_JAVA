package entities;

public class Employee2 {
    private Integer id;
    private String name;
    private Double Salary;
    
    
    public Employee2(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        setSalary(salary);
    }

 


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Double getSalary() {
        return Salary ;
    }


    public void setSalary(Double salary) {
        Salary = salary;
    }

    
    public void salaryIncrease(double perc){
        setSalary((perc/100 * getSalary()) + getSalary());
           
    }

 


    

}
