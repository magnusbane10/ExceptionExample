package exampleGenericInterface;

import java.net.PortUnreachableException;

public class Main4 {
    public static void main(String[] args) {
        Car car1 = new Car(150);
        Car car2 = new Car(250);

        if(car1.compareTo(car2) > 0){
            System.out.println("car1 is faster");
        } else {
            System.out.println("car2 is faster");
        }

        Procesor procesor1 = new Procesor(4500);
        Procesor procesor2 = new Procesor(3600);

        if(procesor1.compareTo(procesor2) > 0){
            System.out.println("procesor1 is faster");
        } else {
            System.out.println("procesor2 is faster");
        }

    }
}
