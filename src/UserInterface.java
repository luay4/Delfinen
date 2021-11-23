import java.util.Scanner;

public class UserInterface {

    public void printMenu() {
        System.out.print("""
                ""Welcome to Delfinen. Choose what you want to do:
                                
                1) Create new member   
                2) Handle subscription
                3) View all subscriptions
                4) View all results
                0) Exit
                
                Enter command:  """);
    }

    public void printMessage(String s) {
        System.out.println(s);
    }

    public Member getMemberInfo(Scanner scanner) {
        System.out.print("Enter members name: ");
        String memberName = scanner.nextLine();
        System.out.print("Enter members age: ");
        int memberAge = scanner.nextInt();
        System.out.print("Enter subscription type: ");
        String subscriptionType = scanner.nextLine();
        System.out.print("Enter swimmer type: ");
        String swimmerType = scanner.nextLine();

        Member member = new Member(memberName, memberAge, subscriptionType, swimmerType);
        return member;
    }

}

