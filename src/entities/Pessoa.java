package entities;

public class Pessoa {
    private String name;
    private int age;
    private double height;
    private String genero;

    
    
    
    public Pessoa(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
       
    }

    public Pessoa( double height,String genero) {
        this.height = height;
        this.genero = genero;
        
       
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
