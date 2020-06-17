import java.util.Comparator;
import java.util.List;

import static java.lang.System.*;

public class SortedList {

    public static void sortedList() {

        List<Car> CarSorted = AddInstance.getCarList();

        CarSorted.stream()
                .sorted(Comparator.comparing(Car :: getBrand))
                .forEach(out :: println);
    }
}
