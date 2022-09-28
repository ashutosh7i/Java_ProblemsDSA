//step1- import Scanner class-
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream

        String name = sc.next();

        System.out.println("Hello, " + name + "!");
    }
}
