// 1
// 22
// 333
import java.util.Scanner;

public class P6{
   public static void main (String[] args){
       //Scanner for input🤖
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
       }
    }
}