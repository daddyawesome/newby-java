package tutorial;


import java.util.Scanner;

public class MainIfElse {
    public static void main(String[] args){
        //TODO

        System.out.println("Please type anything:");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("Mark")){
            System.out.println("You type Mark");
        }else if(s.equals("Hello")){
            System.out.println("Hi!");
        }else if(s.equals("Hi")){
            System.out.println("Hello!");
        }else {
            System.out.println("You typed something");
        }

    }
}
