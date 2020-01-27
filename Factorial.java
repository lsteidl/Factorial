import java.util.Scanner;

// Factorial calculator for digits 1-12
//
public class Factorial {

  public static void main(final String[] args) {
    int n = 0; // user input
    int result; // calculation result
    final Scanner reader = new Scanner(System.in);
    ;
    while (true) {
      System.out.println("Calculate Factorial of...(enter number 1-12)");
      System.out.println("Enter 0 to exit");
      if (reader.hasNextInt()) { // error prevention
        n = reader.nextInt(); // get next integer from scanner
      }
      if (n == 0) // end loop when user enters 0
        break;
      else if (n < 1 || n > 12) 
        System.out.println("Number must be 1-12");
      else {
        result = calculate(n); // perform recursive calculation
       // result = iterative_calculate(n); // perform iterative calculation
        System.out.println("Factorial of " + n + " is: " + result);
      }
      reader.nextLine(); // clear extra data from bufferr
    }
    reader.close(); // close scanner
  }

  // recursively performs factorial calulation
  //
  //
  public static int calculate(final int n) {
    if (n == 1) { // base case
      return 1;
    } else { // recursive call
      return (n * calculate(n - 1));
    }
  }

  public static int iterative_calculate(int n){
    int result = 1;
    while(n > 0){
      result = n * result;
      n = n - 1;
    }
    return result;
  }
}