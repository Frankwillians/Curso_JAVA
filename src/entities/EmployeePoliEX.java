package entities;

public class EmployeePoliEX {
    private String name;
    protected Integer hours;
    protected Double valueperhour;
    
    public EmployeePoliEX(){
    }
    
    public EmployeePoliEX(String name, Integer hours, Double valueperhour) {
        this.name = name;
        this.hours = hours;
        this.valueperhour = valueperhour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValueperhour() {
        return valueperhour;
    }

    public void setValueperhour(Double valueperhour) {
        this.valueperhour = valueperhour;
    }

    public Double payment(){
        return hours*valueperhour;
    }


    
}
