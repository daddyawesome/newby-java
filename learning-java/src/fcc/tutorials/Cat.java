package fcc.tutorials;

public class Cat extends Dog {

    private int food;

    public Cat(String name, int age, int food) {
        super(name, age);
        this.food=food;
    }

    //another cosntructor
    public Cat(String name, int age) {
        super(name, age);
        this.food=0;
    }

    public Cat(String name) {
        super(name, 0);

    }
    @Override
    public void speak() {
        System.out.println("Meow!! My name is "+ this.name+" and I eat "+this.food+" cans of tuna");
        System.out.println("I am "+this.age+" years old.");
    }
}
