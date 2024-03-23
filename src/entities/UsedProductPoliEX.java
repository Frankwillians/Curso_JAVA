package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProductPoliEX extends ProductPoliEX {
    public SimpleDateFormat sdtf1 = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProductPoliEX(){
        super();
    }

    public UsedProductPoliEX(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProductPoliEX(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() +" (Used) " + "$ " + getPrice() + " (Manufacture Date: " + sdtf1.format(manufactureDate)+")";
    }

    
    

  
    

    

    
}
