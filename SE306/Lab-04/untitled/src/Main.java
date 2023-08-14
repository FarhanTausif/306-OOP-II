import java.util.InputMismatchException;
import java.lang.ArithmeticException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int quotient(int numerator, int denominator) throws ArithmeticException, InputMismatchException{
        return numerator/denominator;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;
        do{
            try{
                System.out.println("Please enter an integer numerator:");
                int numerator = sc.nextInt();
                System.out.println("Please enter an integer denominator:");
                int denominator = sc.nextInt();

                int result = quotient(numerator, denominator);

                System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
                continueLoop = false;
            }
            catch(InputMismatchException inputMismatchException){
                System.out.printf("Exception: %s\n", inputMismatchException);
                sc.nextLine();
                System.out.printf("You must enter integers. Please try again\n");
            }
            catch(ArithmeticException arithmeticException){
                System.out.printf("Exception: %s\n", arithmeticException);
                System.out.println("Zero is an invalid denominator. Please try again!\n");
            }
            catch(Exception e){
                System.out.printf("Exception: %s\n", e);
                System.out.println("Please ");
            }
            finally{
                System.out.printf("Success!\n");
            }
        }while(continueLoop);
    }
}