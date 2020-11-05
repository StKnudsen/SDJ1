import java.util.ArrayList;

public class TestClubMember
{
  public static void main(String[] args)
  {
    ArrayList<ClubMember> clubMembers = new ArrayList<>();

    clubMembers.add(new Junior("John", 14, 'b'));
    clubMembers.add(new Junior("Jill", 13, 'g'));
    clubMembers.add(new Senior("Bob", 35));
    clubMembers.add(new Senior("Bib", 37));
    clubMembers.add(new OldBoys("Henry", 63, 6));
    clubMembers.add(new OldBoys("Mimi", 68, 10));

    for (ClubMember member : clubMembers)
    {
      System.out.println(member);
      System.out.println("Yep, membership fee is: $" + member.getMembershipFee());
    }
  }
}
