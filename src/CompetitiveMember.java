public class CompetitiveMember extends Member{

    private Discipline swimmingDiscipline;
    private CompetitiveResult competitiveResults;
    private double bestLapCrawl;
    private double bestLapButterfly;
    private double bestLapBackCrawl;
    private double bestLapBreast;


    public CompetitiveMember(String memberName, String memberAge, String subscriptionType) {
        super(memberName, memberAge, subscriptionType);
    }
}
