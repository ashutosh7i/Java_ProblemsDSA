//to print>
// * * *
// * * *
// * * *
//Observe , row = 3, column =3 , we wil take single num n;

import java.util.Scanner;
public class StarSquare{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print("* ");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}