import java.util.Optional;

public class OptionalExample {

    public static void optionalExample() {

        /* Class Optional is a container object and was introduced in Java 8
        with the purpose to provide a solution for a null references.*/

        // Create a Optional
        Optional<String> car = Optional.ofNullable("Mazda");

        /*isPresent() is used to find if there is a value present in Optional
        return true = the value is present*/
        System.out.println("Lista contine elemente: " + car.isPresent());

        //ifPresent() is used to print the value  if there is a value present in Optional
        car.ifPresent(value -> System.out.println("Lista contine brandul: " + value));
    }
}
