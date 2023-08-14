import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    private static final String[] colors = {"Yellow", "Red", "Black", "Blue", "Purple"};
    private static final String[] color2 = {"Gold", "Silver", "Brown", "Cyan", "Magenta"};

    public ListTest() {
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();

        //add elements
        for(String color: colors) list1.add(color); // Collections.addAll(list1, colors);
        for(String color: color2) list2.add(color); // Collections.addAll(list2, color2);

        list1.addAll(list2);
        list2 = null;
        printList(list1);
        convertToUpperCaseStrings(list1);
        printList(list1);
        removeItems(list1, 4, 7);
        printList(list1);
        printReversedList(list1);

    }

    public void printList(List<String> list) {
        System.out.println("\nList:");
        for (String color : list) System.out.print(color + " ");
        System.out.println();
    }
    public void convertToUpperCaseStrings(List<String> list){
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }

    }

    public void removeItems(List<String> list, int start, int end){
        System.out.printf("Removing items %d to %d", start, end-1);
        list.subList(start, end).clear();
    }

    public void printReversedList(List<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.print("Reversed List:\n");
        while(iterator.hasPrevious()){
            System.out.printf("%s\t", iterator.previous());
        }
        System.out.println();
    }

}
