package entities;

public class ImportedProductPoliEX extends ProductPoliEX{
    private Double customsFee;

    public ImportedProductPoliEX(){
        super();
    }

    public ImportedProductPoliEX(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    public Double totalPrice(){
        return getPrice() + customsFee;
     }

    @Override
    public String priceTag(){
        return getName() + " $" + totalPrice() + "(Custom Fee: $ " + customsFee + ")";
    }

    
  
    

    
  
}
