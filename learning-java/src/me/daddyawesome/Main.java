package me.daddyawesome;

import java.time.LocalDate;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    // Non Primitive data types AKA refrence types
        String name = new String( "Daddy Awesome");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());
    }
}
