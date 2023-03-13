public class Car {

    // Create fields
    private int weight; // car weight
    private float maxSpeed; // car max speed
    private String country;// car made-in country
    private int age;// car age

    // Constructors
    public Car(int weight, float maxSpeed, String country, int age){

        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.country = country;
        this.age = age;
    }

    public Car() {

    }

    // 1st method
    public void beepSignal(){
        System.out.println("B-e-e-e-p");
    }

    // 2nd method
    public boolean inMove(){
        return true;
    }

    // 3rd method (answer)
    public String toString(){
        return "\nCar object{ " + "Weight: " + this.weight + ", Max speed: " + this.maxSpeed + ", Country: " +
                this.country + ", Age: " + age + " }";
    }

    // setters
    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setMaxSpeed(float maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setCountry(String country){
        this.country = country;
    }


    // getters
    public int getWeight(){
        return weight;
    }

    public float getMaxSpeed(){
        return maxSpeed;
    }

    public int getAge(){
        return age;
    }

    public String getCountry(){
        return country;
    }

}
