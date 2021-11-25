public class CompetitiveMember extends Member {

    private CompetitiveResult competitiveResults;

    private boolean isCrawlSwimmer;
    private boolean isButterflySwimmer;
    private boolean isBackStrokeSwimmer;
    private boolean isBreastStrokeSwimmer;

    private double bestLapCrawl;
    private double bestLapButterfly;
    private double bestLapBackCrawl;
    private double bestLapBreast;


    public CompetitiveMember(String memberName, String memberAge, String subscriptionType,
                             boolean isCrawlSwimmer, boolean isButterflySwimmer,
                             boolean isBackStrokeSwimmer, boolean isBreastStrokeSwimmer) {
        super(memberName, memberAge, subscriptionType);
        this.isCrawlSwimmer = isCrawlSwimmer;
        this.isButterflySwimmer = isButterflySwimmer;
        this.isBackStrokeSwimmer = isBackStrokeSwimmer;
        this.isBreastStrokeSwimmer = isBreastStrokeSwimmer;

    }
}
