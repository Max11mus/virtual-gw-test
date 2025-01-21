import java.util.Scanner;

import static java.lang.Math.floor;

public class Task3 {
    private static final String GREEN = "green";
    private static final String YELLOW = "yellow";
    private static final String RED = "red";
    private static final String UNKNOWN = "unknown";

    private static final int GREEN_TIME_START = 0;
    private static final int YELLOW_TIME_START = 3;
    private static final int RED_TIME_START = 4;
    private static final int CYCLE_LENGTH = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();

        System.out.println(determineColorSignal(t));
    }

    public static String determineColorSignal(double time) {
        int timeInCycle = (int) floor(time) % CYCLE_LENGTH;
        if (timeInCycle == RED_TIME_START) {
            return RED;
        } else if (timeInCycle == YELLOW_TIME_START) {
            return YELLOW;
        } else if (timeInCycle >= GREEN_TIME_START) {
            return GREEN;
        }
        return UNKNOWN;
    }

}
