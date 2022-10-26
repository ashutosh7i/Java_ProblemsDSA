//first//check if given number is a prime number or not
//a prime number is a number that is only divisible by 1 and number itself
import java.util.Scanner;
public class Pattern{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=n){
                System.out.print("* ");
                j++;
            }
            System.out.println("*");
            i++;
        }
        }
    
}