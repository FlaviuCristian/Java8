import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * The method generate random String and find the "max" value
 * We will create a new Set and with the .add method
 * we add a specific element into a Set collection.
 *
 * @param randomStrings - set of Strings
 * @return the maximum value from the set of Strings
 * Java 8 introduced few improvements to the Comparator interface,
 * including some very useful static functions.
 * Comparator.comparing static function returns a Comparator object
 * that will use the specified field as the sort key
 */

public class RandomString {

    public static final String NUMERIC_STRING = "abcdefghijklmnopqrstuvwxyz0123456789";
    public static Set<StringBuilder> randomString;

    public static void randomString() {

        randomString = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            {
                StringBuilder stringBuilder = new StringBuilder();

                // the length of the string will be randomly generated
                int count = (int) (30 * Math.random()) + 5;

                while (count-- != 0) {
                    int position = (int) (Math.random() * NUMERIC_STRING.length());
                    final char character = NUMERIC_STRING.charAt(position);
                    stringBuilder.append(character);
                }

                randomString.add(stringBuilder);

                // we get the String from the StringBuilder
                final String result = stringBuilder.toString();
                System.out.println(result);
            }
        }
        Optional<StringBuilder> maxString = randomString.stream()
                .reduce((value1, value2) ->
                        value1.length() > value2.length() ? value1 : value2);

        maxString.ifPresent(value -> System.out.println("The MAX2 String is: " + value));
    }

    public static Set<StringBuilder> getRandomString() {
        return randomString;
    }
}





