public class Subscription {
    // Sikkert forkert sat op - velkommen til at slette

    private double juniorSubscriptionPrice = 1000;
    private double adultSubscriptionPrice = 1600;
    private double seniorSubscriptionPrice = adultSubscriptionPrice * 0.75;
    private double passiveSubscriptionPrice = 500;

    public Subscription(AgeGroup ageGroup, String subscriptionType) {

    }

    public int expectedIncome() {
        return 0;
    }
}
