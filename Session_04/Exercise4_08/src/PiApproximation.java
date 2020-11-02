/**
 *  An approximation for p can be calculated using a finite number
 *  of terms by the following series
 *
 *  pi = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/9 ...
 *
 *  Calculate an approximation to pi with 500 terms.
 */

public class PiApproximation
{
  public static void main(String[] args)
  {
    final int TERMS = 50000;
    double pi = 0;

    for (int i = 0; i < TERMS; i++)
    {
      if (i%2 == 0) // add
      {
        pi += 4.0 / (i * 2 + 1);
      }
      else // subtract
      {
        pi -= 4.0 / (i * 2 + 1);
      }
    }

    System.out.println("Pi approximated: " + pi);
  }
}
