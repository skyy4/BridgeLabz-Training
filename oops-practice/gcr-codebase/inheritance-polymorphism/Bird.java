class Animal {
    String name;
    int age;

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    public Dog(String name,int age){
        super(name,age);
    }

    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public Cat(String name,int age){
        super(name,age);
    }

    @Override
    void makeSound(){
        System.out.println("Cat meows");
    }
}

public class Bird extends Animal {
    public Bird(String name,int age){
        super(name,age);
    }

    @Override
    void makeSound(){
        System.out.println("Bird chirps");
    }

    public static void main(String[] args){
        Animal[] arr={
            new Dog("Tommy",3),
            new Cat("Kitty",2),
            new Bird("Parrot",1)
        };
        for(Animal a:arr)
            a.makeSound();
    }
}

