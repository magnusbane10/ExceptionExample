public class Main2 {
    public static void main(String[] args) {
        Car car = new Car("Audi");
        Animal animal = new Animal("Leu");

        GenericBox genericBox = new GenericBox(car);
        GenericBox genericBox1 = new GenericBox(animal);

        GenericBox[] genericBoxes = {genericBox, genericBox1};

        for(GenericBox items: genericBoxes){
            System.out.println(items.getItem());
        }

    }
}
