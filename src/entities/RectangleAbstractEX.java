package entities;

import entities.enums.Color;

public class RectangleAbstractEX extends ShapeAbstract {
    private Double width;
    private Double height;

    public RectangleAbstractEX(){
        super();
    }

    public RectangleAbstractEX(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public RectangleAbstractEX(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area(){
        return width*height;
    }

    

}


    

    
