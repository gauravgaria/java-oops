package exercise;

import java.util.Scanner;

public class NTermsProblems {

    public static void main(String[] args) {
        NTermsProblems probs = new NTermsProblems();
        System.out.println("Enter a number");
        Scanner sumInput = new Scanner(System.in);
        //int n = sumInput.nextInt();
        int revNum = sumInput.nextInt();
      //  probs.sumOfNumbers(n);
        probs.reverseNumber(revNum);
    }

    public void sumOfNumbers(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
            sum += i;
        }
        System.out.println("sum of n numbers " + sum);
    }

    public void reverseNumber(int number){
        int reverse=0;
        while(number>0){
            reverse = number % 10;
            number = number/10;
            System.out.print(reverse);
        }

    }
}
