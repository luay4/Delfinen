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

    public int expectedIncome() {
        return 0;
    }
}