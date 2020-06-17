public class Main {

    public static void main(String[] args) {

        System.out.println("1) Write 5 different instances of that object.");
        AddInstance.addInstance();
        System.out.println();

        System.out.println("2) Find the elements containing the letter \"a\" " +
                "that start with \"M\" and print them out.");
        FindTheElement.findTheElement();
        System.out.println();

        System.out.println("3) Find the \"min\" using a custom comparing criteria of choice.");
        FindTheMin.findTheMin();
        System.out.println();

        System.out.println("4) Generate 5 random Strings and add them to a Set. " +
                "Find the \"max\" (while explaining as Javadoc how comparing Strings works)");
        RandomString.randomString();
        System.out.println();

        System.out.println("5) Generate a random number of Integers and then count them. " +
                "\"Map\" the exponential to the numbers and then print them out.");
        RandomNumber.randomNumber();
        System.out.println();

        System.out.println("6) Create a map of \"n\" (K,V) elements and print \"how many\" " +
                "elements have value over 10 (the key is of your choice)");
        MapOfElement.mapOfElement();
        System.out.println();

        System.out.println("7) Sort the above Set<String> (used for max) in reverse order");
        ReversString.reversString();
        System.out.println();

        System.out.println("8) 8) Sort the above List of custom objects (used for filter) " +
                "in an order you consider");
        SortedList.sortedList();
        System.out.println();

        System.out.println("9) Check if any of your instances \"match\" a condition " +
                "based on an Integer field (of your choice). What does it return ? Print it out.");
        CheckMatch.checkMatch();
        System.out.println();

        System.out.println("10) What does Optional represent ? " +
                "Explain through an example on your custom object");
        OptionalExample.optionalExample();
        System.out.println();

        System.out.println("11) Fastest way to find the shortest String in a List " +
                "(take the 5 random Strings generated above and find the shortest one).");
        ShortestString.shortestString();
    }
}
