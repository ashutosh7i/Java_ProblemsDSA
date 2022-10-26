//given a series 1 to n, n from user.
//find the sum of all even numbers from 1 to new
import java.util.Scanner;
public class FindsumofallevenNo{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i=0;

        while(i<=n){
            if(i%2==0){
                sum += i;
            }
        i++;
        }
        System.out.println(sum);
    }
}