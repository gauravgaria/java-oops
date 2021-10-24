package exercise;

import java.util.Scanner;

public class Calculator {

    private Utility util;

    public static void main(String[] args) {
        new Calculator().askUserInput();
    }

    public int addNumbers(int num1, int num2){return num1 + num2;}

    public int subtractNumbers(int num1, int num2){
        return num1 - num2;
    }

    public int multiplyNumbers(int num1, int num2){
        return num1 * num2;
    }

    public float divideNumbers(int num1, int num2){
        return num1/num2;
    }

    public void askUserInput(){
        System.out.println("Want to perform any operation.? type yes : no");
        Scanner userAns = new Scanner(System.in);
        String userInput = userAns.nextLine();
        if(userInput.equals("yes"))
            askOperationInput();
        else
            System.out.println("Thank you for playing.!");
    }

    public void askOperationInput(){
        System.out.println("Which operation do you want to perform.? \n add \n subtract \n multiply \n divide");
        Scanner opInput = new Scanner(System.in);
        String _opsInput = opInput.nextLine();
        util = new Utility();
        int[] numbers = util.userInput();
        switch (_opsInput){
            case "add":{
                    int sum = addNumbers(numbers[0],numbers[1]);
                System.out.println(sum);
                break;
            }
            case "subtract":{
                int subtract = subtractNumbers(numbers[0],numbers[1]);
                System.out.println(subtract);
                break;
            }
            case "multiply":{
                int multiply = multiplyNumbers(numbers[0],numbers[1]);
                System.out.println(multiply);
                break;
            }
            case "divide":{
                float divide = divideNumbers(numbers[0],numbers[1]);
                System.out.println(divide);
                break;
            }
            default:{
                System.out.println("Please enter input to perform any operation");
            }
        }

        askUserInput();

    }

}
