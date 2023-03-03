package session2;

public class demo1 {
    int num1;
    int num2;
        public void setNum (int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }
        public void showNum () {
            System.out.println("Value of num1 is " + num1);
            System.out.println("Value of num2 is " + num2);
        }

    public static void main(String args[]) {
        demo1 obj1 = new demo1();
        demo1 obj2 = new demo1();
        obj1.setNum (2,3);
        obj2.setNum (4,5);
        obj1.showNum();
        obj2.showNum();
    }
}
