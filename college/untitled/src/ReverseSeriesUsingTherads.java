//program to print reverse series using threads.

import java.util.Scanner;

public class ReverseSeriesUsingTherads extends Thread {
    int n;
    ReverseSeriesUsingTherads(int n){
        this.n=n;
    }
    public void run(){
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        ReverseSeriesUsingTherads r=new ReverseSeriesUsingTherads(n);
        r.start();
    }
}