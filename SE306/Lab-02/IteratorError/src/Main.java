import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        ListIterator<String> iterator = list.listIterator();
        list.add("Red");
        list.add("Green");
        while(iterator.hasNext()){
            System.out.printf(iterator.next());
            System.out.println();
        }
        changeList(list,"Blue");

        while(iterator.hasPrevious()){
            System.out.printf(iterator.previous());
            System.out.println();
        }

    }
    public static void changeList(List<String> list,String color){
        list.add(color);

    }
}