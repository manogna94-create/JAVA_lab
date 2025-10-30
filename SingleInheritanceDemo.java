class Person {
    String name;
    int age;

    void input(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class SingleInheritanceDemo extends Person {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    void showStudentInfo() {
        display();
        System.out.println("Roll Number: " + rollNo);
    }
}

    public static void main(String[] args) {
        SingleInheritanceDemo s = new SingleInheritanceDemo();
        s.input("Alice", 20);
        s.setRollNo(101);
        s.showStudentInfo();
    }
}
