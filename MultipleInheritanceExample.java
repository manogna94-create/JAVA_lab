interface Printable {
    void print();
}

interface Showable {
    void show();
}

// A class implementing both interfaces
class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printing from Printable interface.");
    }

    public void show() {
        System.out.println("Showing from Showable interface.");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
        d.show();
    }
}
