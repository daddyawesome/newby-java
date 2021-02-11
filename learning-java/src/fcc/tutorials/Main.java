package fcc.tutorials;

public class Main {
    public static void main(String[] args){
        Dog mark = new Dog("Mark", 2);
        mark.speak();
        Dog king = new Dog("King", 4);
        king.speak();
        Dog daddy = new Dog("Daddy", 7);
        daddy.speak();

        int x;
        x = mark.getAge();
        System.out.println(x);

        king.setAge(5);
        king.speak();
    }
}
