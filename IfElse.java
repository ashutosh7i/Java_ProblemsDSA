//Task
//        Given an integer, n, perform the following conditional actions:
//        • Ifn is odd, print Wei rd
//        • If n is even and in the inclusive range of 2 to 5, print Not Wei rd
//        • Ifn is even and in the inclusive range of 6 to 20, print Wei rd
//        • Ifn is even and greater than 20, print Not Wei rd
//        Complete the stub code provided in your editor to print whether or not n is
//        weird.
//        Input Format
//        A single line containing a positive integer, n.
//        Constraints
//        • 1 < 100
//        Output Format
//        Print Wei rd if the number is weird; otherwise, print Not Wei rd.
//        Sample Input O
//        3
//        Sample Output O
//        Wei rd
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==1){
            System.out.println("Weird");
        }
        else if (n%2==0&&(n<=5&&n>=2)){
            System.out.println("Not Weird");
        }
        else if (n%2==0&&(n<=6&&n>=20)){
            System.out.println("Weird");
        }
        else if (n%2==0&&(n>=20)){
            System.out.println("Not Weird");
        }



    }
}
