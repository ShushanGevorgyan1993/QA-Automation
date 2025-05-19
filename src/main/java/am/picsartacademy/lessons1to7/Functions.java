package am.picsartacademy.lessons1to7;

public class Functions {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 89, 4, 5};
        int m = maxValue(array);
        System.out.println(m);

        int [] array1 = {9,4, 46, 99, 0};
        int k = maxValue(array1);
        System.out.println(k);
    }

    public static int maxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}