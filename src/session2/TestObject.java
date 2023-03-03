package session2;

class ObjectClass {
    Integer num;
    public ObjectClass() {}
    public ObjectClass (Integer num){
        this.num = num;
    }
    public void getStringForm () {
        System.out.println("String form of num is: " +num.toString());
    }
}

public class TestObject {
    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass(1234);
        ObjectClass obj2 = new ObjectClass(1234);
        obj1.getStringForm();

        if(obj1.equals(obj2))
            System.out.println("Objects are equal");
        else System.out.println("Objects are not equal");
        obj2 = obj1;

        if(obj1.equals(obj2))
            System.out.println("Objects are  equal");
        else
            System.out.println("Objects are not equal");
    }
}
