package exercise;

import java.util.Scanner;

public class NTermsProblems {

    public static void main(String[] args) {
        NTermsProblems probs = new NTermsProblems();
        System.out.println("Enter a number");
        Scanner sumInput = new Scanner(System.in);
        //int n = sumInput.nextInt();
        int revNum = sumInput.nextInt();
      //  probs.sumOfNumbers(n);              ---> sum of numbers
      //  probs.reverseNumber(revNum);        ---> reverse the number
      //  probs.palindrome(revNum);           ---> product of digits
          probs.producOfDigits(revNum);
    }

    public void sumOfNumbers(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
            sum += i;
        }
        System.out.println("sum of n numbers " + sum);
    }

    public int reverseNumber(int number){
        int reverse=0;
        while(number>0){
            reverse = (reverse*10) + number % 10;
            number = number/10;
        }
        System.out.println("reverse no is " + reverse);
        return reverse;
    }

    public void palindrome(int number){

        int reverse = reverseNumber(number);
        if(number == reverse)
            System.out.println("yes it is a palindrome number");
        else
            System.out.println("No " + number + " and " + reverse + " are not equal.!" );
    }

    public void producOfDigits(int number){
        int product=1;
        while(number>0){
            if(number >10){
                product = product * (number%10);
            }
            else{
                product = product * number;
            }


            number = number/10;
        }
        System.out.println(product);

    }

    /*public void askAgain(){
        System.out.println("Want to perform operation again.?  yes:no " );
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if(userInput.equals("yes"))
            producOfDigits();
        else
            System.out.println("thank you");
    }*/
}
