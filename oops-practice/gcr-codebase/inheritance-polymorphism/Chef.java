interface Worker {
    void performDuties();
}

class PersonBase {
    String name;
    int id;

    public PersonBase(String name,int id){
        this.name=name;
        this.id=id;
    }
}

public class Chef extends PersonBase implements Worker {
    public Chef(String n,int i){
        super(n,i);
    }

    public void performDuties(){
        System.out.println("Cooking food");
    }
}

