package tutorial;


import java.util.Scanner;

public class MainNestedIfElse {
    public static void main(String[] args){
        //TODO

        System.out.println("Please Enter you age:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >=18){
            System.out.println("What is your favorite food?");
            String food = sc.nextLine();

            if (food.equals("humba")){
                System.out.println("mine too.");
            }
            else {
                System.out.println("not mine");
            }
        }
        else if(age >= 13 ){
            System.out.println("You are teenager");
        }
        else {
            System.out.println("You are not an adult or a teenager");
        }

    }
}
