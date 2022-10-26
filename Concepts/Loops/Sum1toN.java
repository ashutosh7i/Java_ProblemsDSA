import java.util.Scanner;

public class Sum1toN{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        //taking n
        int i=1;
        int n = sc.nextInt();
        //using while loop to print Sum1toN
        int sum=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}