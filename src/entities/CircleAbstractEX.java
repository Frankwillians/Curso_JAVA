package entities;

import entities.enums.Color;

public class CircleAbstractEX extends ShapeAbstract {
    public final double PI = 3.14;
    private Double radius;

    public CircleAbstractEX(){
        super();
    }

    public CircleAbstractEX(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public CircleAbstractEX(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area(){
        
        return PI*(Math.pow(radius, 2));
    }
}
