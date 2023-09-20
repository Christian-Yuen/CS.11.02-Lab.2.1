import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String a) {
        String r2 = "早上好, " + a + "!";
        return r2;
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String a) {
        String r = "下午好, " + a + "!";
        return r;
    }

    // 5. triple
    public static String triple(String a) {
        String r = a + a + a;
        return r;
    }

    // 6. half
    public static double half(double c) {
        double i = c / 2;
        return i;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a) {
        int i = (int) Math.round(a);
        return i;
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a) {
        double f = Math.ceil(a);
        double p = a - f;

        if (p <= -0.5) {
            int o = (int) Math.floor(a);
            return o;
        } else {
            int i = (int) Math.ceil(a);
            return i;
        }
    }
}