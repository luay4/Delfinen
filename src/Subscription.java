import java.util.ArrayList;

public class Subscription {

    private double juniorSubscriptionPrice = 1000;
    private double adultSubscriptionPrice = 1600;
    private double seniorSubscriptionPrice = adultSubscriptionPrice * 0.75;
    private double passiveSubscriptionPrice = 500;

    private Member member;
    private double subscriptionRate;

    private boolean subscriptionPayed;

    public Subscription(Member member) {
        this.member = member;

        if (member.getSubscriptonType().equals("youth")){
            subscriptionRate = juniorSubscriptionPrice;
        } else if (member.getSubscriptonType().equals("adult")){
            subscriptionRate = adultSubscriptionPrice;
        } else if (member.getSubscriptonType().equals("senior")){
            subscriptionRate = seniorSubscriptionPrice;
        } else if (member.getSubscriptonType().equals("passive")) {
            subscriptionRate = passiveSubscriptionPrice;
        }
    }

    public double expectedIncome(ArrayList<Member> listOfAllMembers) {
        int juniorMembers = 0;
        int adultMembers = 0;
        int seniorMembers = 0;
        int passiveMembers = 0;

        ArrayList<Member> members = listOfAllMembers;

        for (int i = 0; i < members.size(); i++){
            if (members.get(i).getSubscriptonType().equals("youth")){
                juniorMembers++;
            } else if (members.get(i).getSubscriptonType().equals("adult")){
                adultMembers++;
            } else if (members.get(i).getSubscriptonType().equals("senior")){
                seniorMembers++;
            } else if (members.get(i).getSubscriptonType().equals("passive")) {
                passiveMembers++;
            }
        }
       return (juniorMembers * juniorSubscriptionPrice) + (seniorMembers * seniorSubscriptionPrice)
               + (adultMembers * adultSubscriptionPrice) + (passiveMembers * passiveSubscriptionPrice);
    }
}