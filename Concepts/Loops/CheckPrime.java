//check if given number is a prime number or not
//a prime number is a number that is only divisible by 1 and number itself
import java.util.Scanner;
public class CheckPrime{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while(i<n){
            if(n%i==0){
                System.out.println("Not Prime");
            }
            else{
                System.out.println("Is Prime");
            }
            i++;
        }
        }
    
}