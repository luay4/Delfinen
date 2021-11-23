public class Member {


    //Personal info
    private String memberName;
    private int memberAge;


    //Svømme info
    private String subscriptionType;
    private AgeGroup ageGroup;
    private String swimmerType;


    private double personalBest;
    private String discipline;


    //payment info
    private boolean paidSubscription;

public Member (String memberName, int memberAge, String subscriptionType, String swimmerType){
    this.memberName = memberName;
    this.subscriptionType = subscriptionType;
    this.swimmerType = swimmerType;


    if (this.memberAge >= 18) {
        this.ageGroup = AgeGroup.SENIOR;
    } else {
        this.ageGroup = AgeGroup.JUNIOR;
    }

}



}
