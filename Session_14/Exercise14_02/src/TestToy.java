import java.util.ArrayList;

public class TestToy
{
  public static void main(String[] args)
  {
    ArrayList<Toy> toys = new ArrayList<>();

    Football football1 = new Football(4, 32);
    Football football2 = new Football(4, 32);
    Handball handball1 = new Handball(6, 26);
    Handball handball2 = new Handball(4, 22);
    Lego lego1 = new Lego(4, 42);
    Lego lego2 = new Lego(6, 4242);

    toys.add(football1);
    toys.add(football2);
    toys.add(handball1);
    toys.add(handball2);
    toys.add(lego1);
    toys.add(lego2);

    for (Toy toy:toys)
    {
      System.out.println(toy.play());
    }

    System.out.println(toys.get(0).equals(toys.get(1)));  // expect true
    System.out.println(toys.get(2).equals(toys.get(3)));  // expect false
    System.out.println(toys.get(4).equals(toys.get(5)));  // expect false

    System.out.println(toys.get(0));
    System.out.println(toys.get(2));
    System.out.println(toys.get(4));
  }
}
