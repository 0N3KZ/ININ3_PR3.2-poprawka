package device;

import creatures.Human;

import java.util.Objects;

public abstract class Car extends Device implements Saleable {
    public Double millage;
    public String fueltype;
    public String color;
    public Double value;
    public Double price;
    public String name;
    public Double amountoffuel;

    public Car(String model,Double value,Double price, String producer, Integer yearOfProduction, Double millage, String fueltype, String color, String name, Double amountoffuel) {
        super(yearOfProduction, model, producer);
        this.millage = millage;
        this.fueltype = fueltype;
        this.color = color;
        this.price = price;
        this.value = value;
        this.name = name;
        this.amountoffuel = amountoffuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(millage, car.millage) && Objects.equals(fueltype, car.fueltype) && Objects.equals(color, car.color) && Objects.equals(value, car.value) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(millage, fueltype, color, value, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "millage=" + millage +
                ", fueltype='" + fueltype + '\'' +
                ", color='" + color + '\'' +
                ", value=" + value +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("przekrecam kluczyk");
        System.out.println("czekam na zgasniecie kontrolek");
        System.out.println("odpalam");
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        boolean isCarInGarage = false;
        for (int i = 0; i < seller.garage.length; i++) {
            if (seller.garage[i] != null && seller.garage[i].equals(this)) {
                isCarInGarage = true;
                break;
            }
        }
        if (!isCarInGarage) {
            throw new Exception("Sprzedawca nie posiada tego samochodu w garażu.");
        }

        int freespace = -1;
        for (int i = 0; i < buyer.garage.length; i++) {
            if (buyer.garage[i] == null) {
                freespace = i;
                break;
            }
        }
        if (freespace == -1) {
            throw new Exception("Kupujący nie posiada wolnego miejsca w garażu.");
        }

        if (buyer.cash < price) {
            throw new Exception("Kupujący nie posiada wystarczającej ilości pieniedzy.");
        }

        for (int i = 0; i < seller.garage.length; i++) {
            if (seller.garage[i] != null && seller.garage[i].equals(this)) {
                seller.garage[i] = null;
                break;
            }
        }

        buyer.garage[freespace] = this;
        seller.cash += price;
        buyer.cash -= price;
        System.out.println("Transakcja zakończyła się sukcesem.");
    }
}


