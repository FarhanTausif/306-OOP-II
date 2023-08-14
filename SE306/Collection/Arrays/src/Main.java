public class Main {
    public static void main(String[] args) {
        UseArrays arrays = new UseArrays();
        System.out.println(arrays);
        arrays.printEquality();
        int index = arrays.searchForInt(56);
        if(index >= 0)
            System.out.println("Found at index: " + index);
        arrays.printArrays();
        arrays.printEquality();
    }
}