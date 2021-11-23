import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    public void printMenu() {
        System.out.print("""
                ""Welcome to Delfinen. Choose what you want to do:
                                
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
        System.out.print("Enter subscription type: ");
        String subscriptionType = scanner.nextLine();
        memberInfo.add(subscriptionType);

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

        return memberInfo;
    }



}

