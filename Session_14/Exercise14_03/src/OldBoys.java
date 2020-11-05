public class OldBoys extends ClubMember
{
  private int yearsOfMembership;

  public OldBoys(String name, int age, int yearsOfMembership)
  {
    super(name, age);
    this.yearsOfMembership = yearsOfMembership;
  }

  public int getYearsOfMembership()
  {
    return yearsOfMembership;
  }

  public void setYearsOfMembership(int yearsOfMembership)
  {
    this.yearsOfMembership = yearsOfMembership;
  }

  public String toString()
  {
    return super.toString() + " Old Boys member with a membership fee of $" + getMembershipFee();
  }

  @Override public double getMembershipFee()
  {
    double fee = 0;

    if ( yearsOfMembership < 5 )
    {
      fee = 300;
    }

    if ( yearsOfMembership >= 5 && yearsOfMembership <= 9 )
    {
      fee = 200;
    }

    if ( yearsOfMembership > 9 )
    {
      fee = 100;
    }

    return fee;
  }
}
