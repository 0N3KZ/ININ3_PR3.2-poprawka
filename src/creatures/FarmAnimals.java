package creatures;

public class FarmAnimals extends Animal implements Edbile {

    public String productionType;
    public Double price;
    public FarmAnimals(String species, Double weight, Boolean alive, String productionType, Double price) {
        super(species);
        this.weight = weight;
        this.alive = alive;
        this.productionType = productionType;
        this.price = price;
    }

    public void beEaten() {
        if (this.alive) {
            System.out.println(this.species + " jest zjedzony.");
            this.alive = false;
        } else {
            System.out.println("Nie można zjeść martwego zwierzaka.");
        }
    }
}