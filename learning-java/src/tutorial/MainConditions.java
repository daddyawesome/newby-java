package tutorial;


import java.util.Scanner;

public class MainConditions {
    public static void main(String[] args){
        //TODO

        int x = 64;
        int y = 78;
        int z = 10;

        // > < == >= <= !=

        boolean compare = x < y;

        System.out.println(compare);

        //Comparing String
        String sx = "Hello";
        String sy = "Hi";

        boolean scompare = sx == sy;
        System.out.println(scompare);

        // boolean operator &, || and !()
        boolean ocompare = !(x>y & x>z);
        System.out.println(ocompare);

    }
}
