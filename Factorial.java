//Write a java program to find the factorial of a number using
//(a) recursive method
//(b) iterative method

import java.util.Scanner;

class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.print("Enter a number to find factorial ");
        n=sc.nextInt();
        System.out.println("Result using Recursion : "+Recursion(n));
        System.out.println("Result after using Iteration "+Iteration(n));
    }
    public static int Recursion(int num)
    {
        if (num >= 1)
            return num*Recursion(num - 1);
        else
            return 1;
    }
    public static int Iteration(int num){
        int prod=1;
        for(int i=num;i>=1;i--){
            prod*=i;
        }
        return prod;
    }

}


