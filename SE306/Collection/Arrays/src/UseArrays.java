import java.util.Arrays;

public class UseArrays {
    private int intArray[] = {2,56,8,4,3,1,14,9};
    private double doubleArray[] = {2.3, 5.6, 3.6, 9.5};
    private int filledIntArray[], intArrayCopy[];

    //Constructor


    public UseArrays() {
        filledIntArray = new int[10];
        intArrayCopy = new int [ intArray.length ];

        Arrays.fill(filledIntArray, 7);
        Arrays.sort(doubleArray);

        //copy Array
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        //          srcArr, startIndex(copy), destArr,  StartIndex(paste), NoOfElements
    }

    public int[] getIntArray() {
        return intArray;
    }

    public double[] getDoubleArray() {
        return doubleArray;
    }

    public int[] getFilledIntArray() {
        return filledIntArray;
    }

    public int[] getIntArrayCopy() {
        return intArrayCopy;
    }

    public void printArrays(){
        System.out.println("intArray:");
        for (int intVal: intArray) System.out.printf("%d ", intVal);
        System.out.print("\ndoubleArray:");
        for (double doubleVal: doubleArray) System.out.printf("%f ", doubleVal);
        System.out.print("\nfilledIntArray:");
        for (int filledVal: filledIntArray) System.out.printf("%d ", filledVal);
        System.out.print("\nintArrayCopy:");
        for (int copiedVal: intArrayCopy) System.out.printf("%d ", copiedVal);
        System.out.println();
    }

    public int searchForInt( int value ){
        Arrays.sort(intArray);
        return Arrays.binarySearch(intArray, value);
    }

    public void printEquality(){
        boolean equal = Arrays.equals(intArray, intArrayCopy);
        System.out.println(equal);
        System.out.printf("intArray %s intArrayCopy\n",(equal ? "==" : "!=") );
        equal = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray\n", (equal ? "==" : "!=") );
    }

    @Override
    public String toString() {
        return "Arrays{\n" +
                "intArray=" + Arrays.toString(intArray) +
                ", doubleArray=" + Arrays.toString(doubleArray) + "\n" +
                ", filledIntArray=" + Arrays.toString(filledIntArray) +
                ", intArrayCopy=" + Arrays.toString(intArrayCopy) +
                "\n}";
    }
}
