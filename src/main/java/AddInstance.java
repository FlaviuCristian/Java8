import java.util.ArrayList;
import java.util.List;

public class AddInstance {
    public static List<Car> carList;

    public static List<Car> addInstance() {

        carList = new ArrayList<>();
        carList.add(new Car("Dacia", 75, 1.1));
        carList.add(new Car("Mazda", 120, 2.1));
        carList.add(new Car("Tesla", 200, 2.5));
        carList.add(new Car("Mitsubishi", 135, 1.9));
        carList.add(new Car("Maserati", 250, 3.2));

        System.out.println("All car brand are: ");
        carList.forEach(System.out :: println);
        return null;
    }

    public static List<Car> getCarList() {
        return carList;
    }
}

