package creatures;

import creatures.Animal;
import device.Car;
import device.Phone;

public class Human extends Animal {
    private static final int DEFAULT_GARAGE_SIZE = 3;
    private static final Double DEFAULT_HUMAN_WEIGHT = 70.0;
    private static final Double DEFAULT_START_SALARY = 0.0;
    private static final String HUMAN_SPECIES = "homosapiens";
    public String firstname;
    public String lastname;
    public Car[] garage;
    public Double cash;
    public Phone phone;
    public Animal animal;
    public Double salary;

    public  Human(String firstname){
        super("homosapiens");
        this.salary = 0.0;
        this.firstname = firstname;
        this.weight = 70.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }
    public Human(String firstname, Integer garageSize) {
        super(HUMAN_SPECIES);
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.salary = DEFAULT_START_SALARY;
        this.firstname = firstname;
        this.garage = new Car[garageSize];
    }
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Sprzedaż ludzi jest zabroniona.");
        return;
    }

    public void setCar(Car newCar, Integer parkingLotNumber) {
        if (parkingLotNumber >= this.garage.length) {
            System.out.println("sorry, nie mamy tak dużego garażu");
        } else if (parkingLotNumber < 0) {
            System.out.println("chyba coś ci na łeb upadło");
        } else if (this.garage[parkingLotNumber] != null) {
            System.out.println("sorry miejsce zajęte");
        } else {
            this.garage[parkingLotNumber] = newCar;
        }
    }
    public void getCar(Integer parkingLotNumber) {
        if (parkingLotNumber >= this.garage.length) {
            System.out.println("sorry, nie mamy tak dużego garażu");
        } else if (parkingLotNumber < 0) {
            System.out.println("chyba coś ci na łeb upadło");
        } else if (this.garage[parkingLotNumber] == null) {
            System.out.println("na tym miejscu nie ma zadnego auta");
        } else {
            this.garage[parkingLotNumber] = null;
        }
    }

    public Double getValueOfAllCars() {
        Double valueOfCars = 0.0;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] != null) {
                valueOfCars += this.garage[i].value;
            }
        }
        return valueOfCars;
    }
    public void displayGarage() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] != null) {
                System.out.println("na miejscu nr " + i + " jest auto: " + this.garage[i].toString());
            } else {
                System.out.println("Miejsce nr " + i + " jest puste");
            }
        }
    }
    public void sortGarage() {
        for (int i = 1; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                continue;
            }
            Car ter = this.garage[i];
            int j = i - 1;
            while (j >= 0 && (this.garage[j] == null || this.garage[j].yearOfProduction > ter.yearOfProduction)) {
                this.garage[j + 1] = this.garage[j];
                j = j - 1;
            }
            this.garage[j + 1] = ter;
        }
        displayGarage();
    }
}
