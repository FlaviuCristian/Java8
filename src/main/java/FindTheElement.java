import java.util.List;

public class FindTheElement {

    public static void findTheElement() {

        List<Car> filteredCar = AddInstance.getCarList();

        filteredCar.stream()
                .filter(car -> car.getBrand().startsWith("M") && car.getBrand().contains("a"))
                .forEach(System.out :: println);
    }
}
