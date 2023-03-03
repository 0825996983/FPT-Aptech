package session3;

public class ScopeOfVariables {
    public static void main(String[] args) {
        int x;
        x = 10;
        {
            int y = 20;
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        System.out.println("x is:" + x);
    }
}
