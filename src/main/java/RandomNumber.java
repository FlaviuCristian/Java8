import java.util.*;
import java.util.stream.Collectors;

public class RandomNumber {

    static void randomNumber() {

        System.out.println("The random numbers are: ");
        List<Integer> randomNumber = new Random().ints(0, 100)
                .limit(10).boxed().collect(Collectors.toList());
        System.out.println(randomNumber);

        System.out.println("The exponential of the numbers are: ");
        randomNumber.stream()
                .map(Math :: exp)
                .forEach(System.out :: println);
    }
}
