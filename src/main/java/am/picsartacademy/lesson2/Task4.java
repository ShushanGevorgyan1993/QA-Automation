package am.picsartacademy.lesson2;

public class Task4 {
    public static void main(String[] args) {

        int[] array = new int[]{2, 27, 25, 4, 18, 20, -15, -100, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0)
                System.out.println("This number can be divided by 5 " + "/" + array[i] + "/");
        }
    }
}
