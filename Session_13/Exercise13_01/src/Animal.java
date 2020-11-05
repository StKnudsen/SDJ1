public class Animal
{
  private int speed;
  private String name;
  protected int positionX;
  protected int positionY;

  public Animal(int speed, String name)
  {
    this.speed = speed;
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getSpeed()
  {
    return speed;
  }

  public void setSpeed(int speed)
  {
    this.speed = speed;
  }

  public void moveTo(int newPosX, int newPosY)
  {
    positionX = newPosX;
    positionY = newPosY;
  }

  public String makeAnimalSound()
  {
    return "Not defined yet!";
  }
}
