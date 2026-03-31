package JavaGenerics;

interface MealPlan {
    String type();
}

class VegetarianMeal implements MealPlan {
    public String type() {
        return "Vegetarian";
    }
}

class KetoMeal implements MealPlan {
    public String type() {
        return "Keto";
    }
}

class Meal<T extends MealPlan> {
    T plan;

    Meal(T plan) {
        this.plan = plan;
    }
}

class MealUtil {
    static <T extends MealPlan> void generate(T meal) {
        System.out.println("Meal Plan: " + meal.type());
    }
}

public class MealTest {
    public static void main(String[] args) {
        MealUtil.generate(new VegetarianMeal());
        MealUtil.generate(new KetoMeal());
    }
}
