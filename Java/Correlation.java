package Java;

import java.util.Scanner;

public class Correlation {

    public static void main(String[] args) {

        Correlation calc = new Correlation();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter No of elements (n): ");
        int n = s.nextInt();
        Double X[] = new Double[n];
        System.out.println("Enter Elements of Array X: ");
        for (int i = 0; i < n; i++) {
            X[i] = s.nextDouble();
        }
        Double Y[] = new Double[n];
        System.out.println("Enter Elements of Array Y: ");
        for (int i = 0; i < n; i++) {
            Y[i] = s.nextDouble();
        }
        calc.correlationCoefficient(X, Y, n);
        s.close();
    }

    void correlationCoefficient(Double X[], Double Y[], int n) {

        Double sum_X = 0.0, sum_Y = 0.0, sum_XY = 0.0;
        Double squareSum_X = 0.0, squareSum_Y = 0.0;

        for (int i = 0; i < n; i++) {
            // sum of elements of array X.
            sum_X += X[i];

            // sum of elements of array Y.
            sum_Y += Y[i];

            // sum of X[i] * Y[i].
            sum_XY += X[i] * Y[i];

            // sum of square of array elements.
            squareSum_X += X[i] * X[i];
            squareSum_Y += Y[i] * Y[i];
        }

        // use formula for calculating correlation coefficient
        Double corr = (Double) (n * sum_XY - sum_X * sum_Y)
                / (Double) (Math.sqrt((n * squareSum_X - sum_X * sum_X) * (n * squareSum_Y - sum_Y * sum_Y)));
        System.out.println("Correlation Coefficient is " +corr);
        System.out.println("sum of elemnts in x = "+sum_X);
        System.out.println("sum of elemnts in y = "+sum_Y);
        System.out.println("sum of x[i] * y[i] = "+sum_XY);
        System.out.println("sum of square of array elements, square sum X = "+squareSum_X+" square sum Y = "+squareSum_Y);
    }

}