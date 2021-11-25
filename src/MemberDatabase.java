import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class MemberDatabase {


    private ArrayList<Member> members;
    private ArrayList<CompetitiveMember> competitiveMembers;
    private FileHandler fh = new FileHandler();

    public MemberDatabase() throws FileNotFoundException {
        members = fh.readFromFile();
    }


    public void createMember() throws FileNotFoundException {
        Controller controller = new Controller();
        ArrayList<String> memberInfo = controller.createMember();
        if (memberInfo.get(3).equals("n")) {
            Member member = new Member(memberInfo.get(0), memberInfo.get(1), memberInfo.get(2));
            members.add(member);
            fh.writeToFile(member);
        } else {
            /*CompetitiveMember competitiveMember = new CompetitiveMember(memberInfo.get(0),
                    memberInfo.get(1), memberInfo.get(2));
            members.add(competitiveMember);
            fh.writeToFile(competitiveMember);*/
        }

    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public ArrayList<Member> getTop5FastestSwimTimesForEachDiscipline(){
        return members;
    }
    
    public ArrayList<Member> getAmountOfJuniorMembers(){
        return members;
    }

    public ArrayList<Member> getAmountOfAdultMembers(){
        return members;
    }


    public ArrayList<Member> getAmountOfSeniorMembers(){
        return members;
    }

    public ArrayList<Member> getAmountOfPassiveMembers(){
        return members;
    }

    public ArrayList<Member> getAmountOfActiveMembers(){
        return members;
    }

    public ArrayList<Member> getAmountOfRestanceMembers(){
        return members;
    }

    public ArrayList<Boolean> getMemberDisciplines(ArrayList<Boolean> disciplines) {
        return disciplines;
    }


}
