package am.picsartacademy.lessons1to7;

public class Lesson4 {
    public static void main(String[] args) {

        //Task1

        int[] a = new int[]{126, 7};

        //Task2

        int[] numbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }

        //Task3

        int[] oddNumbers = new int[20];
        int firstNumber = -19;
        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers[i] = firstNumber;
            System.out.print(oddNumbers[i] + " ");
            firstNumber += 2;
        }

        //Task4

        int[] array = new int[]{2, 27, 25, 4, 18, 20, -15, -100, 0};
        for (int j : array) {
            if (j % 5 == 0) System.out.println("This number can be divided by 5 " + "/" + j + "/");
        }

        //Task6

        int[] array3 = new int[]{2, 8, 34, 5, -5, -12, 23, 46, 26, 198};
        int count = 0;
        for (int number : array3) {
            if (number % 2 == 0) count++;
        }
        System.out.println(count);

        //Task7

        int n = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

    }
}
