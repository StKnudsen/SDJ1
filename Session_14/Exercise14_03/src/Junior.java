public class Junior extends ClubMember
{
  private char gender;

  public Junior(String name, int age, char gender)
  {
    super(name, age);
    this.gender = gender;
  }

  public char getGender()
  {
    return gender;
  }

  public String toString()
  {
    return super.toString() + " Junior member of the gender "+ gender +" and membership fee of $" + getMembershipFee();
  }

  @Override public double getMembershipFee()
  {
    double fee = 0;

    if (gender == 'b')
    {
      fee = 400;
    }

    if (gender == 'g')
    {
      fee = 300;
    }

    return fee;
  }
}
