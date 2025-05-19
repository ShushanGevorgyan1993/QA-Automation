package am.picsartacademy.trainings.lessons;

public class ProductManagement extends Trainings {
    private boolean usesAgileMethodology;
    private String targetIndustry;
    private boolean includesCaseStudies;

    public boolean isUsesAgileMethodology() {
        return usesAgileMethodology;
    }

    public void setUsesAgileMethodology(boolean usesAgileMethodology) {
        this.usesAgileMethodology = usesAgileMethodology;
    }

    public String getTargetIndustry() {
        return targetIndustry;
    }

    public void setTargetIndustry(String targetIndustry) {
        this.targetIndustry = targetIndustry;
    }

    public boolean isIncludesCaseStudies() {
        return includesCaseStudies;
    }

    public void setIncludesCaseStudies(boolean includesCaseStudies) {
        this.includesCaseStudies = includesCaseStudies;
    }

    @Override
    public void isFull(int currentParticipants) {
        if (currentParticipants > 15) {
            System.out.println("The registration is finished");
        } else System.out.println("Ha-me-ceq");
    }

}

