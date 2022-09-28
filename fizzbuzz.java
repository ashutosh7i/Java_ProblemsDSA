 import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        int start = sc.nextInt();
        int end = sc.nextInt();

        //to loop numbers
        for (int number = start; number <= end; number++)
            if (((number % 3) == 0) && ((number % 5) == 0)) {//divisible by 3&5 both
                    System.out.println("FizzBuzz");
            } else if ((number % 3) == 0) {//which means it is divisible by 3
            System.out.println("Fizz");
            } else if ((number % 5) == 0) {//which means it is divisible by 5
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
    }
}