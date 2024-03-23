package entities;

public class OutsorcedEmployeee extends EmployeePoliEX{
    private Double additionalCharge;

    public OutsorcedEmployeee(){}
    
    public OutsorcedEmployeee(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsorcedEmployeee(String name, Integer hours, Double valueperhour, Double additionalCharge) {
        super(name, hours, valueperhour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        return (hours*valueperhour)+(additionalCharge*110/100);
    }

    


}
