/**
 *  Look at the following series
 *  S(n) = 1 + 1/2 + (1/2)^2 + (1/2)^3 + (1/2)^4 + ... + (1/2)^(n+1)
 *
 *  Calculate S(5), S(25) and S(100).
 */
public class Series
{
  public static void main(String[] args)
  {
    final int series = 3;
    double sum = 1.5; // initial value is 1 + 1/2

    for (int i = 1; i <= series; i++)
    {
      sum += Math.pow(0.5, (i+1));
    }

    System.out.println("Sum is: " + sum);
  }
}
