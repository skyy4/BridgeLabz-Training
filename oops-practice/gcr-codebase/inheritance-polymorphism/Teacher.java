class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}

public class Teacher extends Person {
    String subject;

    public Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }

    void displayRole(){
        System.out.println("Teacher");
    }
}

