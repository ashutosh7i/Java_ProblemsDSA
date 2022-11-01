//write a program to pring fibonacci series using threads


import java.util.Scanner;

public class FibonacciUsingThreads extends Thread {
    int n;
    FibonacciUsingThreads(int n){
        this.n=n;
    }
    public void run(){
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        FibonacciUsingThreads f=new FibonacciUsingThreads(n);
        f.start();
    }
}