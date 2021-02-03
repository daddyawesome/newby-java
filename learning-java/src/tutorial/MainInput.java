package tutorial;


import java.util.Scanner;

public class MainInput {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter your name:");

        String UrName = myObj.nextLine();
        System.out.printf("Your name is %s%n", UrName);

    }
}
