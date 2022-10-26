import java.util.Scanner;
public class PrintusingWhile{
    public static void main (String [] args){

        //taking input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //printing 1 to n
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}