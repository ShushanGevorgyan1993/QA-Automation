package am.picsartacademy.trainings.lessons;

public class ProgrammingLanguages extends Trainings {
    private String languageName;
    private String toolsNeeded;
    private boolean isObjectOriented;
    private boolean examIncluded;


    public void printDetails() {
        System.out.println("Apply now if you want to master in programming");
    }

    public String getLanguageName() {
        return languageName;
    }

    public boolean isObjectOriented() {
        return isObjectOriented;
    }

    public boolean isExamIncluded() {
        return examIncluded;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getToolsNeeded() {
        return toolsNeeded;
    }

    public void setToolsNeeded(String toolsNeeded) {
        this.toolsNeeded = toolsNeeded;
    }


    public void setObjectOriented(boolean objectOriented) {
        isObjectOriented = objectOriented;
    }

    public boolean isExamIncluded(boolean b) {
        return examIncluded;
    }

    public void setExamIncluded(boolean examIncluded) {
        this.examIncluded = examIncluded;
    }

    @Override
    public void startLesson() {
        System.out.println("Join now to get the best learning path");
    }
}
