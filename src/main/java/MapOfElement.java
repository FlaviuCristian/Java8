import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOfElement {

    public static void mapOfElement() {

        Map<String, Integer> element = new HashMap<>();
        element.put("element 1 ", 21);
        element.put("element 2 ", 5);
        element.put("element 3 ", 9);
        element.put("element 4 ", 12);
        element.put("element 5 ", 15);
        element.put("element 6 ", 20);

        List ListOfValue = new ArrayList<>(element.values())
                .stream()
                .filter(i -> i > 10)
                .collect(Collectors.toList());

        System.out.println("The value over 10 of Map are: " + ListOfValue);
    }
}
