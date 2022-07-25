import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k, i;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban: ");
        n = input.nextInt();
        System.out.print("Kuvvet: ");
        k = input.nextInt();

        for (i = 1; i <= k; i++) {

            total *= n;
        }

        System.out.println(n + " ^ " + k + " = " + total);
    }
}