import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class MemberDatabase {


    private ArrayList<Member> members = new ArrayList<>();
    private final String FILE_NAME = "members.csv";
    private PrintStream ps = new PrintStream(new FileOutputStream(FILE_NAME, true));

    public MemberDatabase() throws FileNotFoundException {
    }


    public void createMember() throws FileNotFoundException {
        Controller controller = new Controller();
        ArrayList<String> memberInfo = controller.createMember();
        if (memberInfo.get(3).equals("n")) {
            Member member = new Member(memberInfo.get(0), memberInfo.get(1), memberInfo.get(2));
            members.add(member);
           // ps.println(member);
        } else {
            CompetitiveMember competitiveMember = new CompetitiveMember(memberInfo.get(0),
                    memberInfo.get(1), memberInfo.get(2));
            members.add(competitiveMember);
            //ps.println(competitiveMember);
        }

    }

    public ArrayList<Member> getMembers() {
        return members;
    }
}
