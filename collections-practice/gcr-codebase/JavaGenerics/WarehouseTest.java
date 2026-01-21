package JavaGenerics;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}

class Electronics extends WarehouseItem {
    Electronics(String name){ super(name); }
}

class Groceries extends WarehouseItem {
    Groceries(String name){ super(name); }
}

class Furniture extends WarehouseItem {
    Furniture(String name){ super(name); }
}

class Storage<T extends WarehouseItem> {

    T[] items;
    int index = 0;

    Storage(int size){
        items = (T[]) new WarehouseItem[size];
    }

    void addItem(T item){
        items[index++] = item;
    }

    static void displayAll(WarehouseItem[] items){
        for(WarehouseItem i : items)
            if(i != null)
                System.out.println(i);
    }
}

public class WarehouseTest {
    public static void main(String[] args){
        Storage<Electronics> s = new Storage<>(3);
        s.addItem(new Electronics("Laptop"));
        s.addItem(new Electronics("Phone"));

        Storage.displayAll(s.items);
    }
}
