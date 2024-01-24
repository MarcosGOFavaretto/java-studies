import java.util.Arrays;
import java.util.List;;

public class App {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("one", "two", "three", "four");
        String stringsSeparatedByComma = listOfStrings.stream().reduce("", (result, value) -> result += value + ",");
        System.out.println(stringsSeparatedByComma);
    }

}