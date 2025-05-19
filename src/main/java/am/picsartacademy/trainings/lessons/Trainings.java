package am.picsartacademy.trainings.lessons;

public class Trainings {
    private int cost;
    private String title;
    private String trainerName;
    private int duration;
    private boolean isOnline;
    private String location;

    public void isFull(int currentParticipants) {
        if (currentParticipants >= 12) {
            System.out.println("You can't apply anymore");
        } else
            System.out.println("Apply Now");
    }

    public void startLesson() {
        System.out.println("The lesson has been started");
    }


    public void setCost(int c) {
        cost = c;
    }

    public int getCost() {
        return cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
