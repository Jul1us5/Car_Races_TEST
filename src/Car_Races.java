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
                if(Math.random() <= 0.2) {
                    car.deceleration((int) (Math.random() * 4));
                } else {
                    car.acceleration((int) (Math.random() * 6));
                }
                car.start();
            }
            arraySort(cars);
            System.out.println("----------");
            for (Car car : cars) {
                System.out.println(car.getName() + " " + car.getSpeed() + " " + car.getDistance());
            }
            
        } while (cars[0].getDistance() < 300);
        System.out.println("WIN WIN: " + cars[0].getName());
    }
    public static void arraySort(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            for(int x = 0; x < cars.length; x++) {
                if (cars[i].getDistance() < cars[x].getDistance()) {
                    Car temp = cars[i];
                    cars[i] = cars[x];
                    cars[x] = temp;
                }
            }
            
        }
    }

}
