package me.daddyawesome;

import java.time.LocalDate;
import java.util.ArrayList;

public class LearnJava {
    public static void main(String[] args) {
        // Non primitive Variable
        //addExclamationPoint("atay");
        String exclaim = addExclamationPoint("atay");
        System.out.println(exclaim);

        Animal a = new Animal();
        String dog = a.iAmDog();
        System.out.println(dog);


    }

    public static String addExclamationPoint(String s){
        //System.out.println(s + "!");
        return s + "!";
    }

}
