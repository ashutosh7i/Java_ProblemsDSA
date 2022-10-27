// 3 2 1
// 6 5 4
// 9 8 7
import java.util.Scanner;
public class P4Reverse{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n*n;
        for(int i=n;i>=1;i--){
            for(int j=n;j>=1;j--){
                System.out.print(" "+count);
                count--;
            }
            System.out.println();
        }
        
    }
}