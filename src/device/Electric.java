package device;

import creatures.Human;

public class Electric extends Car {
    public Electric(String model, Double value, Double price, String producer, Integer yearOfProduction, Double millage, String fueltype, String color, String name, Double amountoffuel) {
        super(model, value, price, producer, yearOfProduction, millage, fueltype, color, name, amountoffuel);
    }

    public void refuel(double amount, Human owner) {
        amountoffuel += amount;
        if (amountoffuel > 100) {
            amountoffuel = 100.0;
        }

        System.out.println("auto elektryczne tankuje za darmo :) aktalnie twoje auto ma " + amountoffuel + " % naładowania");
    }

}
