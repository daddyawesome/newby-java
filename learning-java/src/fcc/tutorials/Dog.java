package fcc.tutorials;

public class Dog {
    private String name;
    private int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void speak(){
        System.out.println("I am "+name+" and I am "+age+" years old.");
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
