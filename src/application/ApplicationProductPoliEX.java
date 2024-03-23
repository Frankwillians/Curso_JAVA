package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProductPoliEX;
import entities.ProductPoliEX;
import entities.UsedProductPoliEX;

public class ApplicationProductPoliEX {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdtf1 = new SimpleDateFormat("dd/MM/yyyy");
        List<ProductPoliEX> prod = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        
        for(int i = 0 ; i < n ; i++){
            sc.nextLine();
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i) ? ");
            String resp = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(resp.equals("i")){
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                prod.add(new ImportedProductPoliEX(name, price, fee));
            }
            if (resp.equals("u")){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdtf1.parse(sc.next());
               
                prod.add(new UsedProductPoliEX(name, price,date));
            }
            if(resp.equals("c")) {
                prod.add(new ProductPoliEX(name, price));
            }

        }

        for (ProductPoliEX x : prod) {
            System.out.println(x.priceTag());
        }
        
        sc.close();
    }
}
