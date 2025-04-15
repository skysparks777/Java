interface Greeting {
    default void sayHello() {
        System.out.println("Hello from default method!");
    }
}

class FormalGreeting implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Good day, Sir/Madam!");
    }
}

public class grr
 {
    public static void main(String[] args) {
        Greeting g = new FormalGreeting();
        g.sayHello();
    }
}
