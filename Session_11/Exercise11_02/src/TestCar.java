public class TestCar
{
  public static void main(String[] args)
  {
    Car car = new Car("ABC 123", 42);

    System.out.println("Reg.nr: " + car.getRegistrationNumber());
    System.out.println("Mileage: " + car.getMileage());
    System.out.println(car.getServiceBook());
    car.setRegistrationNumber("555 NYC");

    car.drive(500);
    car.service();
    car.drive(500);
    car.service();
    car.drive(500);
    car.service();
    car.drive(500);
    car.service();
    car.drive(500);

    System.out.println(car.equals(car));

    System.out.println(car);

    /**
    // Test Car
    Car car = new Car("ACB 132", 42);
    Car copy = new Car("ABC 321", 542);

    System.out.println("Mileage: " + car.getMileage());

    System.out.println("Reg.nr: " + car.getRegistrationNumber());

    car.drive(500);
    System.out.println("Car" + car);
    System.out.println(car.equals(copy));

    // Test Service
    MyDate date = new MyDate(05, 10, 2020);
    MyDate date1 = new MyDate(04, 10, 2020);

    Service service = new Service(666, date);
    Service service1 = new Service(666, date);

    System.out.println(service.getMileage());
    System.out.println(service.getDate());
    System.out.println(service.equals(service1));
    System.out.println(service);

    // Test ServiceBook
    ServiceBook book = new ServiceBook();
    book.addService(service);
    System.out.println(book.hasServiceOnDate(date));
    System.out.println(book.hasServiceOnDate(date1));

    ServiceBook book2 = new ServiceBook();
    book2.addService(service);

    System.out.println("Last service @" + book.getDateOfLastService());
    System.out.println("Equals: " + book.equals(book2));
     */
  }
}
