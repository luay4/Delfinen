import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private final String FILE_NAME = "data/members.csv";
    private PrintStream ps = new PrintStream(new FileOutputStream(FILE_NAME, true));

    public FileHandler() throws FileNotFoundException {
        readFromFile();
    }

    public ArrayList<Member> readFromFile(){
        ArrayList<Member> listOfAllMembers = new ArrayList<>();

        // Åbn en fil
        // Læs hver linje i filen
        try{
            //Opret fil object for at arbejde med csv-filen
            File membersFile = new File("data/Members.csv");
            //Scan csv-filen
            Scanner reader = new Scanner(membersFile);
            //Vælg hvordan csv-filen skal splittes
            reader.useDelimiter(";");

            //så længe der er en ny linje
            while(reader.hasNext()) {


                String line = reader.nextLine();
                //Opret et Member object ud fra dataen i den linje
                String[] newMember = line.split(";");

                Member member = new Member(newMember[0], newMember[1], newMember[2]);
                listOfAllMembers.add(member);
            }

        } catch(FileNotFoundException e){
            // No file found - just ignore, and start with empty database!
            listOfAllMembers.clear();
        }
        return listOfAllMembers;
    }

    public void writeToFile(Member member){
        ps.println(member);
    }

}
