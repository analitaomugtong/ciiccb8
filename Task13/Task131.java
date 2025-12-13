package Task13;

// Parent class
class Afritada {
    public void showIngredients() {
        String[] ingredients = {"Tomato Sauce", "Meat"};
        System.out.println("Afritada = " +
                java.util.Arrays.toString(ingredients) + " 🍲\n");
    }
}

// Subclass 1
class Mechado extends Afritada {
    public void showIngredients() {
        String[] ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Tomato Paste"
        };
        System.out.println("Mechado = " +
                java.util.Arrays.toString(ingredients) + " 🍲\n");
    }
}

// Subclass 2
class Menudo extends Afritada {
    public void showIngredients() {
        String[] ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Liver Spread",
            "Raisins",
            "Hotdog"
        };
        System.out.println("Menudo = " +
                java.util.Arrays.toString(ingredients) + " 🍲\n");
    }
}

// Subclass 3
class Caldereta extends Afritada {
    public void showIngredients() {
        String[] ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Tomato Paste",
            "Liver Spread",
            "Raisins",
            "Hotdog",
            "Siling Labuyo",
            "Cheese"
        };
        System.out.println("Caldereta = " +
                java.util.Arrays.toString(ingredients) + " 🍲\n");
    }
}

public class Task131 {
    public static void main(String[] args) {

        // Polymorphism: Afritada reference, different objects
        Afritada meal1 = new Afritada();
        Afritada meal2 = new Mechado();
        Afritada meal3 = new Menudo();
        Afritada meal4 = new Caldereta();

        // Display ingredients
        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}
