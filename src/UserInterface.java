import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    public void printWelcome() {
        System.out.println("Welcome to The Dolphin. Choose what you want to do");
    }

    public void printMenu() {
        System.out.print("""              
                1) Create new member  
                2) View all members 
                3) Handle subscription
                4) View all subscriptions
                5) View all results
                0) Exit
                
                Enter command:  """);
    }

    public void printMessage(String s) {
        System.out.println(s);
    }

    public ArrayList<String> getMemberInfo(Scanner scanner) {
        ArrayList<String> memberInfo = new ArrayList<>();
        System.out.print("Enter members name: ");
        String memberName = scanner.nextLine();
        memberInfo.add(memberName);
        System.out.print("Enter members age: ");
        String memberAge = scanner.nextLine();
        memberInfo.add(memberAge);

        boolean go = true;
        ArrayList<Boolean> disciplineChoices = new ArrayList<>();
         
         while (go) {
             System.out.print("Enter subscription type ('a' for active and 'p' for passive): ");
             String subscriptionType = scanner.nextLine();

             switch (subscriptionType) {
                 case "a":
                     if (Integer.parseInt(memberAge) < 18) {
                         memberInfo.add(SubscriptionType.YOUTH.getType());
                     } else if (Integer.parseInt(memberAge) >= 18 || Integer.parseInt(memberAge) < 60) {
                         memberInfo.add(SubscriptionType.ADULT.getType());
                     } else {
                         memberInfo.add(SubscriptionType.SENIOR.getType());
                     }

                     System.out.println("Which swimming disciplines does the member want to participate in? (y/n)");

                     disciplineChoices.add(disciplineChoice("Crawl" , scanner));
                     disciplineChoices.add(disciplineChoice("Butterfly", scanner));
                     disciplineChoices.add(disciplineChoice("Backstroke", scanner));
                     disciplineChoices.add(disciplineChoice("Breaststroke", scanner));


                     go = false;
                     break;
                 case "p":
                     memberInfo.add(SubscriptionType.PASSIVE.getType());
                     go = false;
                     break;
                 default:
                     System.out.println("Something went wrong, try again");
             }
         }

        boolean loop = true;

        while (loop) {
            System.out.print("Is member competitive? (y/n): ");
            String compStatus = scanner.next();
             if (compStatus.equals("y") || compStatus.equals("n")) {
                 memberInfo.add(compStatus);
                 loop = false;
             } else {
                 System.out.println("Type either 'y' for yes or 'n' for no");
             }
        }

        System.out.println(memberName + " has been created as a member\n");

        return memberInfo;
    }

    public boolean disciplineChoice(String discipline, Scanner scanner) {
        System.out.println(discipline + ": ");
        boolean loop = true;

        while (loop) {
            System.out.print("Crawl: ");
            String choice = scanner.next();
            if (choice.equals("y")) {
                return true;
            } else if (choice.equals("n")) {
                return false;
            } else {
                System.out.println("Type either 'y' for yes of 'n' for no");
            }
        }
        return false;
    }

    public ArrayList<Boolean> getMemberDisciplines(ArrayList<Boolean> disciplines) {
        return disciplines;
    }

}

