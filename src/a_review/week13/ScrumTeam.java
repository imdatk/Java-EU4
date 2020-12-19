package a_review.week13;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String BA, PO, SM;

    public ArrayList<Tester> testers ;
    public ArrayList<Developer> developers;

    public ScrumTeam(String BA, String PO, String SM){
        this.BA = BA;
        this.PO = PO;
        this.SM = SM;
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    public void hireTester(Tester tester){ // adds one tester to the arraylist of tester
        testers.add(tester);
    }

    public void hireTester(Tester[] testers){
        this.testers.addAll(  Arrays.asList(testers ) );
    /*
        for(Tester eachTester : testers) {
            hireTester(eachTester);
        }
     */

    }

    public void hireDeveloper(Developer developer){
        developers.add(developer);
    }

    public void hireDeveloper(Developer[] developers){
      this.developers.addAll( Arrays.asList(developers)  );
            /*
                for(Developer eachDeveloper : developers )  {
                    hireDeveloper(eachDeveloper);
                }
         */
    }





}

/*
ScrumTeam:
		attributes:
			BA, PO, SM (String)
			ArrayList<Tester>
			ArrayList<Developer>
 */
