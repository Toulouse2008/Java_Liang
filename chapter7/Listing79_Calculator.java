/** Listing 7.9 Calculator  */

public class Listing79_Calculator {
  public static void main(String[] args) {
    // check number of strings passed
    if (args.length != 3) {
      System.out.println("Usage: java caculator operand1 operator operand2");
      System.exit(0);
    }

    // The result of the operation
    int result = 0;

    // Determine the operator
    switch (args[1].charAt(0)) {
      case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
      case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
      case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
      case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
    }
    // Display the result
    System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
  }
}
