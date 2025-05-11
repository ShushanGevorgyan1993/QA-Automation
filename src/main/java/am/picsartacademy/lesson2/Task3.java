package am.picsartacademy.lesson2;

public class Task3 {
    public static void main(String[] args) {

        int[] oddNumbers = new int[20];
        int firstNumber = -19;
        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers[i] = firstNumber;
            System.out.println(oddNumbers[i]);
            firstNumber += 2;
        }

    }
}
