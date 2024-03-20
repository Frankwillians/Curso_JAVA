package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class ProgamCompositionEX{

   public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter Client data: ");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birthday (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();
        

        Client client = new Client(clientName, clientEmail, sdf.parse(birthDate));
        
        System.out.println("Enter Order Data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        Order od = new Order(new Date(), OrderStatus.valueOf(status), client);

        System.out.print("How many items you will add: ");
        int n = sc.nextInt();
        
        for (int i  = 0 ; i < n ; i++){
            sc.nextLine();
            System.out.println("Enter Item #" + (i+1) + " data:");
            System.out.print("Product Name: ");
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            Double pPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            
            od.addItem(new OrderItem(quantity, pPrice, new Product(pName, pPrice)));
            
            

            

        }
        
        
        System.out.println(od);
        

        sc.close();

}}