package am.picsartacademy.trainings;

import am.picsartacademy.trainings.lessons.ProductManagement;
import am.picsartacademy.trainings.lessons.ProgrammingLanguages;
import am.picsartacademy.trainings.lessons.Trainings;


public class MainClass {
    public static void main(String[] args) {


        Trainings trainings = new Trainings();
        trainings.setTitle("Java");
        trainings.setCost(120000);
        trainings.setDuration(9);
        trainings.setLocation("E Plaza business center");
        trainings.setTrainerName("Sargis Sargsyan");

        System.out.println("The course is " + trainings.getTitle() + ". The Java course trainer is " + trainings.getTrainerName() +
                ". The location is " + trainings.getLocation() +
                ". The course duration is " + trainings.getDuration() +
                " months, and the cost is " + trainings.getCost());

        System.out.println("---------------------------");

        Trainings javascript = new ProgrammingLanguages();
        javascript.setOnline(true);
        javascript.startLesson();
        System.out.println(javascript.isOnline());

        System.out.println("---------------------------");

        ProgrammingLanguages c = new ProgrammingLanguages();
        c.setLanguageName("C++");
        c.setToolsNeeded("Visual Studio Code, JetBrains CLion");
        c.setObjectOriented(true);
        c.printDetails();
        System.out.println("The course is  " + c.getLanguageName() +
                ". Tools needed: " + c.getToolsNeeded() +
                ". Is OOP: " + c.isObjectOriented());

        System.out.println("---------------------------");

        ProductManagement productManagement = new ProductManagement();
        productManagement.isFull(24);

    }

}
