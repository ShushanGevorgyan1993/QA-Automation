package am.picsartacademy.lessons1to7;

public class Classwork {
    public static void main(String[] args) {
    int n =15;
    for (int i=n; i>0; i--){
        if (i%2 != 0) {
            for (int j=0; j< (n-i)/2; j++) {
                System.out.print((" "));
            }
                for(int k =0; k<i; k++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
    }