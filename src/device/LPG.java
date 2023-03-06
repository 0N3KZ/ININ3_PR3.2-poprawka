package device;

import creatures.Human;

public class LPG extends Car {
    private Double fuelprice = 3.21;
    public LPG(String model, Double value, Double price, String producer, Integer yearOfProduction, Double millage, String fueltype, String color, String name, Double amountoffuel) {
        super(model, value, price, producer, yearOfProduction, millage, fueltype, color, name, amountoffuel);
        ;
    }

    public void refuel(double amount, Human owner) {
        if (owner.cash < (fuelprice * amount)){
            System.out.println("Nie masz wystarczającej ilości pieniedzy, aby zatankować swój samochód z silnikiem Diesla.");
        }
        else{
            System.out.println("Tankowanie samochodu z silnikiem LPG za cenę: " + (fuelprice*amount) + "...");
            owner.cash -= (fuelprice*amount);
            amountoffuel += amount;
            System.out.println("aktualnie posiadasz "+ amountoffuel + " litrow paliwa");
        }
    }
}
