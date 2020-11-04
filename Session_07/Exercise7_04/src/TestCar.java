public class TestCar
{
  public static void main(String[] args)
  {
    Car car = new Car("Jack Black");

    System.out.println(car.getOwner() + " owns a " + car.getColour() + " car " +
        "with the registration number " + car.getRegistrationNumber());
  }
}
