
/**
 *
 * @author evuncik
 */
public class Car_Races {

    public static void main(String[] args) {
        Car[] cars = {
            new Car("Audi", 200),
            new Car("Bmw", 200),
            new Car("Skoda", 200),
            new Car("Opel", 200),
            new Car("Ferrai", 200),
            new Car("Lambo", 200),
            new Car("Toyota", 200),
            new Car("Niva", 200)
        };
        do {
            for (int i = 0; i < cars.length; i++) {
                Car car = cars[i];
                if(Math.random() < 0.2) {
                    car.deceleration((int) (Math.random()) * 4));
                } else {
                    car.acceleration((int) (Math.random()) * 6));
                }
            }
        } while (true);
    }

}
