import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("----------Шкурин Н.Д. РИБО-04-21 1 ВАРИАНТ----------");
        // Scanner connection
        Scanner scanner = new Scanner(System.in);

        //Choosing the type of object
        System.out.print("Enter object type (sport car - 1 / golf car - 2): ");
        String objectType = scanner.nextLine();

        if (Objects.equals(objectType, "1")) {
            // Creating sport car class
            SportCar sportCar = new SportCar();

            // Сollecting data
            System.out.print("Sport car weight: ");
            int weight = scanner.nextInt(); // sport car weight
            sportCar.setWeight(weight);

            System.out.print("Sport car max speed: ");
            float maxSpeed = scanner.nextFloat(); // sport car max speed
            sportCar.setMaxSpeed(maxSpeed);

            System.out.print("Sport car country: ");
            scanner.nextLine();
            String country = scanner.nextLine(); // sport car made in country
            sportCar.setCountry(country);

            System.out.print("Sport car age: ");
            int age = scanner.nextInt(); // age of sport car
            sportCar.setAge(age);

            System.out.print("Sport car model: ");
            scanner.nextLine();
            String model = scanner.nextLine(); // model of sport car
            sportCar.setModel(model);

            System.out.print("Sport car seats: ");
            int seats = scanner.nextInt(); // seats mount of sport car
            sportCar.setSeats(seats);

            // answer output
            System.out.println(sportCar.toString());

        }else if (Objects.equals(objectType, "2")){
            // Сollecting data
            System.out.print("Golf car weight: ");
            int weight = scanner.nextInt(); // golf car weight

            System.out.print("Golf car max speed: ");
            float maxSpeed = scanner.nextFloat(); // golf car max speed

            System.out.print("Golf car country: ");
            scanner.nextLine();
            String country = scanner.nextLine();

            System.out.print("Golf car age: ");
            int age = scanner.nextInt(); // age of golf car

            System.out.print("Golf car number: ");
            int number = scanner.nextInt(); // number of golf car

            System.out.print("Golf car color: ");
            scanner.nextLine();
            String color = scanner.nextLine(); // color of golf car

            // Creating golf car class and outputting answer
            GolfCar golfCar = new GolfCar(weight, maxSpeed, country, age, number, color);
            System.out.println(golfCar.toString());

        } else {
            System.out.println("You entered something wrong!");
        }

    }

}
