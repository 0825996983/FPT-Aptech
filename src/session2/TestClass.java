package session2;

import java.sql.SQLOutput;

class ClassDemo extends MathClass {
    public  ClassDemo() {}
}
public class TestClass {
    public static void main(String[] args) {
        ClassDemo obj = new ClassDemo();
        System.out.println("Class is: " +obj.getClass());
    }
}
