package tutorial;


import java.util.Scanner;

public class MainInput {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your name:");

        //String Scan
        String UrName = myObj.nextLine();
        System.out.printf("Your name is %s%n", UrName);

        Scanner sc = new Scanner(System.in);
        System.out.printf("Give me an integer");

        //Int Scan
        int scanned =sc.nextInt();
        System.out.println(scanned);

    }
}
