package a_review.week13;

import java.util.ArrayList;

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

}

/*
ScrumTeam:
		attributes:
			BA, PO, SM (String)
			ArrayList<Tester>
			ArrayList<Developer>
 */
