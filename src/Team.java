import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Team {

        private ArrayList<CompetitiveMember> teamMembers = new ArrayList<>();
        private AgeGroup ageGroup;
        private String trainerName;

    public Team(AgeGroup ageGroup) throws FileNotFoundException {
      this.ageGroup = ageGroup;
    }

    public void addMemberToTeam(ArrayList<CompetitiveMember> competitiveMembers){

        //Sætter en arrayList til at være lig competitiveMembers for at kunne arbejde med dem;
        ArrayList<CompetitiveMember> listToHandleData = competitiveMembers;


        for (int i = 0; i < listToHandleData.size(); i++){
            //kører listen igennem, og hvis aldersgruppen passer, tilføjer dem til holdet
            if (listToHandleData.get(i).getAgeGroup() == this.ageGroup){
                teamMembers.add(listToHandleData.get(i));
            }
        }

    }

    public ArrayList<CompetitiveMember> getTeamMembers() {
        return teamMembers;
    }



    public void addTeamMember(CompetitiveMember competitiveMember) {
        teamMembers.add(competitiveMember);
    }

}
