import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> cityNames = Arrays.asList("New York", "Londra", "Tokyo");
        cityNames.set(1, "Tegucigalpa");

        System.out.println("Nomi delle città: " + cityNames);

        List<String> kingsOfRome = new ArrayList<>();

        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");

        System.out.println("Re di Roma: " + kingsOfRome);


        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

        kingsOfRomeArray[6] = "Lucio Tarquinio Supercar";

        System.out.println("Array dei re di Roma: " + Arrays.toString(kingsOfRomeArray));
    }
}