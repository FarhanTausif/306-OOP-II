import java.util.*;

public class Sort1 {
    private static final String suits[] =
            { "Hearts", "Diamonds", "Clubs", "Spades" };

    public Sort1(){
        List<String> list = Arrays.asList(suits);
        printElements(list);
        Collections.sort(list);
        printElements(list);
    }
    private static void printElements(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();

        Collections.sort(list);
    }


    public static void main(String[] args) {
        Sort1 sort1 = new Sort1();
    }
}


