package device;

import creatures.Human;

import java.net.URL;
import java.util.List;

public class Phone extends Device implements Saleable {
   public Double screenSize;
    public String os;
    public static final String df_serv_addres = "www.sklepplay.pl";
    public static final String df_protocol = "https";
    public static final String df_version= "0.1e";

    public Phone(Integer yearOfProduction, String model, String producer, Double screenSize, String os) {
        super(yearOfProduction, model, producer);
        this.screenSize = screenSize;
        this.os = os;
    }

    @Override
    public String toString() {
        return "device.Phone{" +
                "screenSize=" + screenSize +
                ", os='" + os + '\'' +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("wciskam przyicsk");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("widze logo");
        System.out.println("czekam");
        System.out.println("działa");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(buyer.cash < price){
            System.out.println("nie masz kasy");
    }else if(seller.phone != this){
        System.out.println("nie masz tego telefonu");
    }
else{
        seller.cash += price;
        buyer.cash -= price;
        buyer.phone = seller.phone;
        seller.phone = null;
            System.out.println("telefon został przekazany "+ buyer.firstname + " transakcja przebegla pomyślnie");
    }

}
    public void installAnnApp(String appName) {
        System.out.println("Instalowanie po nazwie aplikacji " + appName);
    }

    public void installAnnApp(String appName, String version) {
        System.out.println("Instalowanie po nazwie i versji aplikacji  " + appName + " w wersji " + version);
    }

    public void installAnnApp(String appName, String version, String serverAddress) {
        System.out.println("Instalowanie po nazwie, wersji oraz adresu serwera aplikacji  " + appName + " w wersji " + version + " z serwera " + serverAddress);
    }

    public void installAnnApp(List<String> appNames) {
        System.out.println("Instalowanie po liscie aplikacji " + appNames);

    }

    public void installAnnApp(URL appURL) {
        System.out.println("Instalowanie aplikacji z adresu " + appURL);

    }
}


