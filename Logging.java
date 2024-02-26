/**
 * . Tell the user the number of logs that can go on a truck.
 *
 * @author Van
 * @version 1.0
 * @since 2024/02/21
 */
import java.util.*;

public final class Logging {
  /**
   * This is a private constructor used to satisfy the linter.
   *
   * @exception IllegalStateException Utility class.
   * @see IllegalStateException
   */
  private Logging() {
    throw new IllegalStateException("Utility class");
  }

  // Initializes Variable
  public static double numMaxLogs;

  /**
   * . Displays Message.
   *
   * @param args Unused.
   */
  public static void main(final String[] args) {
    // Declared Constants
    final double LOG_LENGTH_1 = 0.25;
    final double LOG_LENGTH_2 = 0.5;
    final double LOG_LENGTH_3 = 1;
    final double WEIGHT_PER_METER = 20;
    final double TRUCK_MAX_WEIGHT = 1100;

    // Starts scanner and asks user
    System.out.println("What is the length of your logs: ");
    Scanner sc = new Scanner(System.in);

    // Checks for valid input
    try {
      double userLength = sc.nextDouble();

      // Calculates how many logs can be carried
      if (userLength == LOG_LENGTH_1) {
        double logWeight = LOG_LENGTH_1 * WEIGHT_PER_METER;
        numMaxLogs = TRUCK_MAX_WEIGHT / logWeight;
        System.out.println("The max number of logs the truck can hold is: " + numMaxLogs);
      } else if (userLength == LOG_LENGTH_2) {
        double logWeight = LOG_LENGTH_2 * WEIGHT_PER_METER;
        numMaxLogs = TRUCK_MAX_WEIGHT / logWeight;
        System.out.println("The max number of logs the truck can hold is: " + numMaxLogs);

      } else if (userLength == LOG_LENGTH_3) {
        double logWeight = LOG_LENGTH_3 * WEIGHT_PER_METER;
        numMaxLogs = TRUCK_MAX_WEIGHT / logWeight;
        System.out.println("The max number of logs the truck can hold is: " + numMaxLogs);
      } else {
        System.out.println("You must input 0.25m, 0.5m, or 1m.");
      }
    } catch (InputMismatchException e) {
      System.out.println("Invalid input. Please enter a valid double value.");
    }
  }
}
