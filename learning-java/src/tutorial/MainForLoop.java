package tutorial;


public class MainForLoop {
    public static void main(String[] args){
        //For loop
        for (int i = 0; i <=10; i++){
            System.out.println("I am in a for loop " + i);
        }

        //for loop with constant increment
        for (int i = 0; i <=10; i+=5){
            System.out.println("I am in a for loop " + i);
        }

        //for loop with variable increment
        int x = 2;
        for (int i = 0; i <=10; i+=x){
            System.out.println("I am in a for loop " + i);
        }

        // for loop in the array
        int[] arr ={2,7,8,5,9,4,5};

        for (int i=0; i<arr.length;i++){
            if (arr[i]== 5){
                System.out.println("Found a 5! at index " + i);
            }
        }
    }
}
