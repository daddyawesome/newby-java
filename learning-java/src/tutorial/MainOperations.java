package tutorial;

public class MainOperations {
    public static void main(String[] args){
        // things to do
        int x = 5;
        int y = 4;
        int z = 15;
        int sum = x + 5 + z;
        int u = z / y ; // this would give us int value
        double v = z / y ; // this would give us int value also because both are int
        double v = z / (double)y ; // this would give us int value also because both are int
        double exp = Math.pow(x,y); //give an exponents

        System.out.println(sum);
    }
}
