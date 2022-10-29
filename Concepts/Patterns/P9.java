//Comment Here Chad😂😉
import java.util.Scanner;

public class P9{
   public static void main (String[] args){
       //Scanner for input🤖
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int count = n;
       for(int i=n;i>=1;i--){
        for(int j=n;j>=i;j--){
            System.out.print(count);
            count--;
        }
        System.out.println();
       }

    }
}