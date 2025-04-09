import java.util.*;

class Animal {
    void speak() {
        System.out.println("Some generic animal sound.");
    }
}

class Elephant extends Animal {
    @Override
    void speak() {
        System.out.println("Elephant.");
    }
}

class Parrot extends Animal {
    @Override
    void speak() {
        System.out.println("Parrot.");
    }
}

class Lion extends Animal {
    @Override
    void speak() {
        System.out.println("Lion.");
    }
}

public class zoo {
    static void makeAnimalSpeak(Animal a) {
        a.speak();
    }

    public static void main(String[] args) {
        Animal l = new Lion();
        Animal e = new Elephant();
        Animal p = new Parrot();

        makeAnimalSpeak(l);
        makeAnimalSpeak(e);
        makeAnimalSpeak(p);
    }
}
