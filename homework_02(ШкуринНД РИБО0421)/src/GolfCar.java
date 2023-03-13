public class GolfCar extends Car {
    private int number; // number of golf car
    private String color; // color of golf car


    // Constructors
    public GolfCar(int weight, float maxSpeed, String country, int age, int number, String color){
        super(weight, maxSpeed, country, age);
        this.number = number;
        this.color = color;
    }

    public GolfCar(){

    }

    //1st method
    public boolean Lights(boolean lights){
        return lights;
    }

    //2nd method
    public boolean playMusic(boolean music){
        return music;
    }

    //3rd method
    @Override
    public String toString() {
        return "\nGolf car object {" + "Weight: " + getWeight() + ", Max speed: " + getMaxSpeed() + ", Country: " + getCountry() +
                ", age: " + getAge() + ", Number: " + this.number + ", Color: " + this.color + "}";
    }

    // getters
    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    // setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
