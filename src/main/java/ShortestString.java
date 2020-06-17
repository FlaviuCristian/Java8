import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShortestString {

    public static void shortestString() {

        List<StringBuilder> string = new ArrayList<>(RandomString.getRandomString());

        Optional<StringBuilder> shortestString = string.stream()
                .reduce((value1, value2) ->
                        value2.length() > value1.length() ? value1 : value2);

        shortestString.ifPresent(value -> System.out.println("The shortest String is: " + value));
    }
}
