interface Researcher {
    void conductLabResearch();
}



class UniversityMember {

    public void attendLecture() {
        System.out.println("Attending a lecture.");
    }
}



class UndergraduateStudent extends UniversityMember {

    public void study() {
        System.out.println("Studying undergraduate courses.");
    }
}



class GraduateResearchAssistant extends UniversityMember implements Researcher {

    @Override
    public void conductLabResearch() {
        System.out.println("GRA is publishing papers and running experiments.");
    }
}



class Professor extends UniversityMember implements Researcher {

    @Override
    public void conductLabResearch() {
        System.out.println("Professor is conducting advanced research.");
    }
}


public class Main {

    public static void main(String[] args) {

        UniversityMember undergraduate =
                new UndergraduateStudent();

        UniversityMember gra =
                new GraduateResearchAssistant();

        UniversityMember professor =
                new Professor();


        undergraduate.attendLecture();
        gra.attendLecture();
        professor.attendLecture();


        Researcher researcher1 =
                new GraduateResearchAssistant();

        Researcher researcher2 =
                new Professor();

        researcher1.conductLabResearch();
        researcher2.conductLabResearch();
    }
}
