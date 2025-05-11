package am.picsartacademy.lesson2;

public class Task6 {

    public static void main(String[] args) {

        int[] array = new int[]{2, 8, 34, 5, -5, -12, 23, 46, 26, 198};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                count++;
        }
        System.out.println(count);
    }
}
