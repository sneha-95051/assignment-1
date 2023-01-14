//Write a program to get a number from the user and print whether it is positive or negative

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = s.nextInt();

        if(num>0)
            System.out.println("number is positive");
        else if(num<0)
            System.out.println("number is negative");
    }
}
