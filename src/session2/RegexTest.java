package session2;
import java.util.regex.Pattern;
import  java.util.regex.Matcher;
import  java.util.Scanner;
public class RegexTest {
    public static void main(String[] args) {
        String flag;
        while (true) {
            System.out.printf("Enter expression:");
            Scanner scanner = new Scanner(System.in);
            Pattern pattern1 = Pattern.compile(scanner.next());
            scanner.nextLine();
            System.out.printf("Enter string to search: ");
            Matcher matcher1 = pattern1.matcher(scanner.next());
            boolean found = false;
            while (matcher1.find()) {
                System.out.printf("Found the text" + "\"%s\"starting at" + "index %d and ending at index %d.%n", matcher1.group(), matcher1.start(), matcher1.end());
                found = true;
            }
            if(!found) {
                System.out.printf("No match dound. \n");
            }
            System.out.println("Press x to exit or y to continue");
            System.out.println("Enter your choice: ");
            flag = scanner.next();
            if (flag.equals("x"))
                System.exit(0);
            else
                continue;
        }
    }
}
