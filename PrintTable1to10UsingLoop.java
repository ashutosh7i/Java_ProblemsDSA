import java.util.Scanner;

public class PrintTable1to10UsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of tables upto");
        int n = sc.nextInt();

        for ( int i=1;i<(n+1);i++) {
            for ( int j=1;j<(n+1);j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }



    }
} 