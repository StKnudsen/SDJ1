public abstract class Ball extends Toy
{
  private int diameter;

  public Ball(int suitableAge, int diameter)
  {
    super(suitableAge);
    this.diameter = diameter;
  }

  public int getDiameter()
  {
    return diameter;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Ball))
    {
      return false;
    }

    Ball other = (Ball) obj;

    return super.equals(other) && diameter == other.diameter;
  }

  @Override public String toString()
  {
    return "Ball{" + "diameter=" + diameter + '}';
  }

  /**
   *  Question: Why is it legal that you in class Ball
   *  don’t implement method play from class Toy?
   *
   *  That is legal because Ball is also an abstract class
   */
}
