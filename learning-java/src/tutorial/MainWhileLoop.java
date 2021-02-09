package tutorial;


import java.util.Scanner;

public class MainWhileLoop {
    public static void main(String[] args){
        // while loop

        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number: ");
        int x = sc.nextInt();

        int count = 0;
        while (x != 5){
            System.out.println("Type 5 ..... please");
            System.out.print("Type a number: ");
            x =sc.nextInt();

            count ++;
        }
        System.out.println("Thank you for typing 5!!!");
        System.out.println("You have tried "+ count +" times.");
    }
}
