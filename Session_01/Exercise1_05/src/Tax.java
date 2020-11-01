public class Tax
{
  public static void main(String[] args)
  {
    double salesTax = 0.25; // DK sales tax = 25%
    double priceItem1 = 80, priceItem2 = 140, priceItem3 = 230;

    System.out.println("Price of " + priceItem1 + " kr item with tax: " + priceItem1 * (1 + salesTax));
    System.out.println("Price of " + priceItem2 + " kr item with tax: " + priceItem2 * (1 + salesTax));
    System.out.println("Price of " + priceItem3 + " kr item with tax: " + priceItem3 * (1 + salesTax));
  }
}
