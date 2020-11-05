public class Hamster extends Animal
{
  private int numberOfHamsterWheels;

  public Hamster(int speed, String name, int numberOfHamsterWheels)
  {
    super(speed, name);
    this.numberOfHamsterWheels = numberOfHamsterWheels;
  }

  public String makeAnimalSound()
  {
    return "Squeaks";
  }

  public void run()
  {
    super.setSpeed((int) Math.pow(super.getSpeed(), 2));
  }
}
