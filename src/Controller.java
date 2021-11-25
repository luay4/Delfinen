import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private boolean running = true;
    private Scanner scanner = new Scanner(System.in);
    private UserInterface ui = new UserInterface();
    private MemberDatabase mdb = new MemberDatabase();

    public Controller() throws FileNotFoundException {
    }

    public void start() throws FileNotFoundException {
        ui.printWelcome();

        while (running) {
            ui.printMenu();

            String input = scanner.nextLine();
            switch (input){
                case "1":
                    mdb.createMember();
                    break;
                case "2":
                    viewMembers();
                    break;
                case "3":
                    handleSubscription();
                    break;
                case "4":
                    viewAllSubscriptions();
                    break;
                case "5":
                    viewAllResults();
                    break;
                case "0":
                    running = false;
                    ui.printMessage("Shutting down");
                    break;
                default:
                    System.out.println("Cannot do that");
            }

        }

    }

    public ArrayList<String> createMember() {
        return ui.getMemberInfo(scanner);
    }

    public void viewMembers() {
        ArrayList<Member> members = mdb.getMembers();
        ui.printMessage("All members: ");
        for (Member member : members) {
            ui.printMessage(member.toString());
        }
        System.out.println();
    }

    public void handleSubscription() {

    }

    public void viewAllSubscriptions() {

    }

    public void viewAllResults() {

    }


}
