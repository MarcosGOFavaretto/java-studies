import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class App {

    public static void main(String[] args) {
        List<String> baseList = new ArrayList<>(Arrays.asList("Marcos", "Gabriel", "de", "Oliveira", "Favaretto"));
        baseList.forEach(System.out::println);

        int index = baseList.indexOf("Gabriel");
        System.out.println("Index of \"Gabriel\": " + index);

        baseList.set(index, "Pastel");
        baseList.forEach(System.out::println);
    }

}