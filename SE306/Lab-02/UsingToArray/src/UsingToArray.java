import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UsingToArray {
    public UsingToArray() {
        String[] colors = {"Red", "Green", "Blue"};

        LinkedList<String> list = new LinkedList<>(Arrays.asList(colors));

        list.addLast("Purple");
        list.add("Pink");
        list.add(2,"Yellow");
        list.addFirst("Orange");

        colors = list.toArray(new String[list.size()]);

        for(String color: colors) System.out.printf("%s ", color);

    }
}
