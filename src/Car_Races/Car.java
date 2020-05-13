package Car_Races;

public class Car {

    private String name;
    private int speed;
    private int MaxSpeed;
    private int distance;

    public Car(String name, int MaxSpeed) {
        this.name = name;
        this.MaxSpeed = MaxSpeed;
        this.speed = 0;
        this.distance = 0;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public int getDistance() {
        return distance;
    }

    public void acceleration(int kiek) {
        this.speed += kiek;
        if (this.speed > this.MaxSpeed) {
            this.speed = this.MaxSpeed;
        }
    }

    public void deceleration(int kiek) {
        this.speed -= kiek;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    public void start() {
        this.distance += this.speed;
    }
}
