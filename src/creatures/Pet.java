package creatures;

public class Pet extends Animal{
    public String name;
    public Integer age;

    public Pet(String species, Double weight, Boolean alive, String name, Integer age) {
        super(species);
        this.weight = weight;
        this.alive = alive;
        this.name = name;
        this.age = age;
    }
}
