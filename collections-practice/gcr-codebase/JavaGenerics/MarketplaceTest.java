package JavaGenerics;

abstract class Category {
}

class BookCategory extends Category {
}

class ClothingCategory extends Category {
}

class Product<T extends Category> {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;  
    }
}

class DiscountUtil {
    static <T extends Product<?>> void applyDiscount(T p, double percent) {
        p.price -= p.price * percent / 100;
    }
}

public class MarketplaceTest {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500);

        DiscountUtil.applyDiscount(book, 10);
        System.out.println(book.price);
    }
}
