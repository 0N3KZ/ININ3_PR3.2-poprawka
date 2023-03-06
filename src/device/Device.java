package device;

public abstract class Device {
    public  String model;
    public  String producer;
    public  Integer yearOfProduction;

    public Device(Integer yearOfProduction, String model, String producer) {
        this.yearOfProduction = yearOfProduction;
        this.model = model;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "device.Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
    public abstract void turnOn();
}
