package ra.config;

import java.util.Scanner;

public class validate {
    public static boolean isValidAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age > 16;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
