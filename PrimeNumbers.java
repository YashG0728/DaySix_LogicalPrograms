package LogicalPrograms;

import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String args[]) {
        int num, count = 0, i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        num = scan.nextInt();
        i = 1;
        while (i <= num) {
            if (num % i == 0)
                count++;
            i = i + 1;
        }
        if (count == 2) {
            System.out.println("prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}

