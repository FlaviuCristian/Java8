import java.util.*;

public class ReversString {

    public static void reversString() {

        List<StringBuilder> reversOrder = new ArrayList<>(RandomString.getRandomString());
        Collections.reverse(reversOrder);

        System.out.println("Revers order: " + reversOrder);
    }
}
