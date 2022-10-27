//Comment Here Chad😂😉
import java.util.Scanner;

public class P7{
   public static void main (String[] args){
       //Scanner for input🤖
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       int count = 1;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(count);
            count++;
        }
        System.out.println();
       }
    }
}