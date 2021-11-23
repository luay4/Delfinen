import java.util.Scanner;

public class Controller {

    private boolean running = true;
    private Scanner scanner = new Scanner(System.in);
    private UserInterface ui = new UserInterface();

    public void start() {


        while (running) {
            ui.printMenu();

            String input = scanner.next();
            switch (input){
                case "1":
                    createMember();
                    break;
                case "2":
                    handleSubscription();
                    break;
                case "3":
                    viewAllSubscriptions();
                    break;
                case "4":
                    viewAllResults();
                    break;
                default:
                    System.out.println("Cannot do that");
            }

        }

    }

    public void createMember() {
        ui.getMemberInfo(scanner);
    }

    public void handleSubscription() {

    }

    public void viewAllSubscriptions() {

    }

    public void viewAllResults() {

    }
}
