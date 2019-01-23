/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carclassexample;

/**
 *
 * @author mtsguest
 */
public class Car {
    
    private String make;
    private String model;
    private String color;
    private int year;
    
    public Car()
    {
        make = "Kia";
        model = "Spectra";
        color = "blue";
        year = 2018;
    }
    
    public Car(String aMake, String aModel, String aColor, int aYear)
    {
        //this is used to initialize values
        this.make = aMake;
        this.model = aModel;
        this.color = aColor;
        this.year = aYear;
    }
    
    public String getMake()
    {
        return make;
    }
    
    public void setMake(String anyMake)
    {
        make = anyMake;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void steer(String direction)
    {
        System.out.println("Car is driving " + direction);
    }
    
    public void brake()
    {
        System.out.println("Brake!!!!");
    }
    
    public void startEngine()
    {
        System.out.println("Brrrrooom, boon, boon!");
    }
    
    public void accelerate(int speed)
    {
        System.out.println("Going " + speed + "mph faster!");
    }
    
   
    
    
    
    public String toString()
    {
        return "Make: " + make + "\n" + "Model: " + model + "\n" + "Color: " + color + "\n" + "Year: " + year;
    }
    
    
}
