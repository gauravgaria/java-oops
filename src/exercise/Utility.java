package exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utility {
    private int _num1, _num2;
    public int[] userInput(){

        try{
            Scanner num1 = new Scanner(System.in);
            System.out.println("Enter first number");
            _num1 = num1.nextInt();
            Scanner num2 = new Scanner(System.in);
            System.out.println("Enter second number");
            _num2 = num2.nextInt();
        }catch (InputMismatchException e){
            System.out.println("error message " + e.getLocalizedMessage());
            return null;
        }

        return new int[]{_num1, _num2};

    }

}
