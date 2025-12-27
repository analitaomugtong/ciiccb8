interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
                   return true;
        }
        return false;
    }

    @Override
    public void groom() {
               System.out.println("Gorilla is being groomed.");
    }

    @Override
    public void pet() {
              System.out.println("You attempt to pet the gorilla... carefully.");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla g = new Gorilla();
        g.feed(true);
        g.groom();
        g.pet();
    }
}
