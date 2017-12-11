package ch05;

public class MaxTest {

    public static void main(String[] args) {
        double m = MaxTest.max(3.1, 40.4, -5);
        System.out.println(m);
    }

    public static double max(double... values) {
        double largest = Double.MIN_VALUE;
        for (double v : values) {
            if (v > largest) {
                largest = v;
            }
        }
        return largest;
    }
}
