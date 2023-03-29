package OOPInheritance;

public class Car {
    public String make = "Ford";
    public  String model = "Mustang";
    public String color = "Red";
    public int doors = 2;
    public boolean convertible = true ;

    public void describeCar(){
        System.out.println("This is a " + color + " " + make + " " + model + " with " + doors + " doors." + (convertible? "Convertible": "Not convertible"));

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        if(make.equals("Ford") || make.equals("Honda") || make.equals("Toyota"))
            this.make = make;
        else
            System.out.println("Invalid make: " + make + " (must be Ford, Honda, or Toyota)");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
