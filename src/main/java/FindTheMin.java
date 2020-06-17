import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindTheMin {

    public static void findTheMin() {

        List<Car> CarMinCP = AddInstance.getCarList();

        Optional<Car> minValue = CarMinCP.stream()
                .min(Comparator.comparing(Car :: getCP));
        System.out.println("The car with the smallest CP value is: " + minValue);
    }
}









