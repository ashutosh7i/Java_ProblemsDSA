//to print
// 1 2 3 
// 1 2 3
// 1 2 3 

import java.util.Scanner;
public class SquareCounting{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while ( i<= n){
            int j=1;
            while (j<=n){
                System.out.print(i);
                j++;
            }
            System.out.println("");
            i++;
        }

        
    }
}