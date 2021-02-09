package tutorial;


import java.sql.SQLOutput;
import java.util.Scanner;

public class MainForEachLoop {
    public static void main(String[] args){
        // for each loop
        int[] arr ={2,7,8,5,9,4,5};
        String[] names = new String[5];

        //For each element in array
        int count = 0;
        for (int element:arr){
            System.out.println(element +" at index "+ count);
            count++;
        }

        Scanner sc = new Scanner(System.in);
        // for each element scan
        for (int i = 0; i < names.length; i++){
            System.out.println("Input");
            String input = sc.nextLine();
            names[i]=input;
        }

        //break in looping
        for (String n:names){
            System.out.println(n);
            if (n.equals("Mark")){
                break;
            }
        }


    }
}
