import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n = input.nextInt();

        // creating 3 integers as summary, count and the number. 
        int sum = 0;
        int count = 0;
        int i = 0;

        //while method used to find out the numbers between 3 / 4
        while (i <= n) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
            i++;
        }
        //average double added to calculate the final formula.
        double average = count != 0 ? (double) sum / count : 0;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);

        //input is closing here.
        input.close();

    }
}
