import java.util.ArrayList;
import java.util.List;

public class CheckMatch {

    public static void checkMatch() {

        List<Car> checkMatch = AddInstance.getCarList();

        boolean match = checkMatch.stream()
                .anyMatch(CP -> CP.getCP() >= 100);

        System.out.println("The list contains care with CP greater than 100: " + match);
    }
}
