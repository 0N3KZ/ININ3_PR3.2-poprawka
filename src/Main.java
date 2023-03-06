import creatures.FarmAnimals;
import creatures.Human;
import creatures.Pet;
import device.Diesel;
import device.Electric;

public class Main {
    public static void main(String[] args) throws Exception {

        Pet kot = new Pet("Ssak",7.0,true,"Fafik",4);
        Pet krolik = new Pet("Ssak", 3.0, true, "Felek", 3);
        FarmAnimals krowa = new FarmAnimals("Ssak",50.0,true,"Mleko",1200.0);
        krowa.feed(2);
        System.out.println(krowa.weight);
        kot.feed();
        System.out.println(kot.weight);
        Diesel citroen = new Diesel("C3",3000.0,2000.0,"citroen",2007,370000.0,"diesel","szary","Citroen",12.2);
        Electric tesla = new Electric("x3",100000.0,120000.0,"Tesla",2020,1200.0,"Electric","black","tesla",70.0);
        Human bartek = new Human("Bartek");
        bartek.cash = 50000.0;

        citroen.refuel(10,bartek);

        System.out.println(bartek.cash);

        tesla.refuel(70,bartek);
        Human kacper = new Human("kacper");
        kacper.setCar(citroen,1);
        kacper.setCar(tesla, 2);
        Human marek = new Human("marek");
        kacper.cash = 20000.0;
        marek.cash = 1000000.0;
        citroen.sell(kacper,marek,20000.0);
        kacper.sortGarage();
        marek.sortGarage();


    }


}