public class Member {


    //Personal info
    private String memberName;
    private String memberAge;


    //Svømme info
    private String subscriptionType;
    private AgeGroup ageGroup;
    private String swimmerType;


    private double personalBest;
    private String discipline;


    //payment info
    private boolean paidSubscription;

    public Member(String memberName, String memberAge, String subscriptionType) {
        this.memberName = memberName;
        this.subscriptionType = subscriptionType;

        if (Integer.parseInt(memberAge) >= 18) {
            this.ageGroup = AgeGroup.SENIOR;
            this.memberAge = memberAge;
        } else {
            this.ageGroup = AgeGroup.JUNIOR;
            this.memberAge = memberAge;
        }
    }

    @Override
    public String toString() {
        return memberName + ";" + memberAge + ";" + subscriptionType + ";" + ageGroup;
    }
}
