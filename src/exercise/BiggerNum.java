package exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BiggerNum {
    private int _num1, _num2;

    public static void main(String[] args) {
        new BiggerNum().askUser();
    }


    public void checkLarger(int _num1, int _num2){
        if(_num1>_num2)
            System.out.println(_num1 + " is larger than " + _num2);
        else
            System.out.println(_num2 + " is larger than " + _num1);

        askUser();
    }

    public void askUser(){
        System.out.println("Want to enter number.? type yes : no");
        Scanner userAns = new Scanner(System.in);
        String userInput = userAns.nextLine();
        if(userInput.toLowerCase().equals("yes")){
            Utility util = new Utility();
            int[] input = util.userInput();
            BiggerNum biggerNum = new BiggerNum();
            biggerNum.checkLarger(input[0],input[1]);
        }
        else
            System.out.println("Thank you for playing.!");
    }

}
