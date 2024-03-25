package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CircleAbstractEX;
import entities.RectangleAbstractEX;
import entities.ShapeAbstract;
import entities.enums.Color;

public class AppAbstractEX {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<ShapeAbstract> list = new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        
        for (int i = 0 ; i <n ; i++){
            System.out.println("SHAPE #" + (i+1)+ " data:");
            System.out.print("Rectangle or circle (r/c) ? ");
            String resp = sc.next();
            System.out.print("Color (BLACK,BLUE,RED): ");
            String respColor = sc.next();
            if (resp.equals("r")) {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new RectangleAbstractEX(Color.valueOf(respColor), width, height));

            }
            if (resp.equals("c")) {
                System.out.print("Radius Value: ");
                double radius = sc.nextDouble();
                list.add(new CircleAbstractEX(Color.valueOf(respColor), radius));

            }

        }
        
        System.out.println("SHAPE AREAS: ");
        for (ShapeAbstract shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }
        
        sc.close();
    }
}
