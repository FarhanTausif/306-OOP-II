import java.util.NoSuchElementException;
import java.util.Vector;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class VectorTest {

    private static final String colors[] = { "red", "white", "blue" };

    public VectorTest(){
        Vector<String> vector = new Vector<>();
        printVector( vector );

        for(String color : colors)
            vector.add( color );

        printVector( vector );

        try {
            System.out.printf("First element: %s\n", vector.firstElement());
            System.out.printf("Last element: %s\n", vector.lastElement());
        }catch ( NoSuchElementException exception){
            exception.printStackTrace();
        }

        if(vector.contains("red"))
            System.out.printf("\n\"red\" found at index: %d\n\n" , vector.indexOf("red"));
        else System.out.println("\n\"red\" not found in the vector");

        vector.remove("red");
        System.out.println("\"red\" has been removed from the vector");

        printVector( vector );


        if(vector.contains("red"))
            System.out.printf("\n\"red\" found at index: %d\n\n" , vector.indexOf("red"));
        else System.out.println("\n\"red\" not found in the vector");

        System.out.printf("\nSize: %d | Capacity: %d\n", vector.size(), vector.capacity());
        vector.trimToSize();
        System.out.printf("\nSize: %d | Capacity: %d\n", vector.size(), vector.capacity());

    }
    private void printVector( Vector<String> vector ){
        System.out.printf("Vector of Colors: ");
        if(vector.isEmpty()) System.out.println("Vector is empty!");
        else {
            for (String element : vector)
                System.out.print(element + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new VectorTest();
    }
}