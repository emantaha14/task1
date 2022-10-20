import java.util.Scanner;

public class Main {
    static String sZ = "safe zone";
    static String dZ = "dangerous zone";
    static String dS = "special zon";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers of values");
        int n = sc.nextInt();
        System.out.println("enter the value please !");
        int val = sc.nextInt();
        int max, min;
        max = min = val;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("enter the value please !");
            val = sc.nextInt();
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }
        int diff = max - min;
        System.out.println("the difference is " + diff);
        printSpecial(max, min);
        printZone(max, min, diff);

    }

    public static void printZone(int max, int min, int diff) {
        if (diff < (0.5 * max)) {
            printDz();
        } else if (diff >= 0.5 * max) {
            printSz();
        }

    }

    public static void printSz() {
        System.out.println(sZ);
    }

    public static void printDz() {
        System.out.println(dZ);
    }

    public static void printSpz() {
        System.out.println(dS);
    }

    public static void printSpecial(int max, int min) {
        if (max == min) {
            printSpz();
        }
    }


}
