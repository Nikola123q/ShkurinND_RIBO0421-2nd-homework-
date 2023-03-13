public class SportCar extends Car {

    // Create fields
    private String model;
    private int seats;

    // Constructors
    public SportCar(int weight, float maxSpeed, String country, int age, String model, int seats) {
        super(weight, maxSpeed, country, age);
        this.model = model;
        this.seats = seats;
    }

    public SportCar() {

    }

    //1st method
    public void ZeroTo100(int time) {
        System.out.println("Time to 0-100: " + time);
    }

    //2nd method
    public boolean Comfort(boolean comfort) {
        return comfort;
    }

    // 3rd method(answer)
    @Override
    public String toString() {
        return "\nSport car object {" + "Weight: " + getWeight() + ", Max speed: " + getMaxSpeed() + ", Country: " + getCountry() +
                ", age: " + getAge() + ", Model: " + this.model + ", Seats: " + this.seats + "}";
    }

    // setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }


    // getters
    public String getModel() {
        return model;
    }

    public int getSeats() {
        return seats;
    }

}