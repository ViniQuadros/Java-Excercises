//Find de nth root
import java.lang.Math;

public class Root {
    public static double root(double num, double root)
    {
        double rootResult = Math.pow(num, 1.0 / root);

        return rootResult;
    }

    public static void main(String[] args) {
        double root = root(11, 2);

        System.out.println("Result: " + root);
    }
}
