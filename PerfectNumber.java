package LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int Sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Number");
        long n = scan.nextLong();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                Sum = Sum + i;
            }
        }
        if (Sum == n) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
    }
}

