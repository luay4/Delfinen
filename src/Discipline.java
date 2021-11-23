public enum Discipline {

    BUTTERFLY("Butterfly"),
    CRAWL("Crawl"),
    BACKSTROKE("Backstroke"),
    BREASTSTROKE("Breaststroke");

    private final String name;

    Discipline(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
