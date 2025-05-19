package am.picsartacademy.lessons1to7;

public class WhileDoWhile {
    public static void main(String[] args) {

        int a = 1;
        while (a < 5) {
            System.out.println(a);
            a++;
        }

        do {
            System.out.println(a);
        } while (a < 5);

        String[] weekDays = {"Monday", "Tuesday", "Wednesday"};
        for (String weekDay : weekDays) {
            System.out.println(weekDay);
        }
    }

}

