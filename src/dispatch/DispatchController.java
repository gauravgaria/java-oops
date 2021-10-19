package dispatch;

import java.util.Date;

public class DispatchController {

    final private static String _username = "gary";
    //----- method overloading -----//
    /*** NOTE: static method can be called directly -> since only one instance
     * */
    private static int sum(int num1, int num2){
        return num1+num2;
    }

    private static int sum(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static void main(String[] args) {
        String[] dispatchImg = {"image1","image2","image3"};
        Dispatch dispatch = new Dispatch(908282,"kjags7s22",dispatchImg,"100019191","Gaurav");
        System.out.println(dispatch.getUsername()+"_"+dispatch.getBarcode()+"_"+ new Date().toString());

        // use of static className.method/var -> since there is only one instance of static.
        System.out.println(DispatchController.staticMessage());

        /** constructor null pointer error example.
         * */
        new Dispatch("GAURAV");
        new Dispatch().setConnection();

        System.out.println(sum(1,2));
        System.out.println(sum(2,3,5));
        System.out.println(OuterClass.message() + OuterClass.url);

        /** Check how return is working
         * */

        validateUser();
    }

    private static String staticMessage(){

        return "I am a static method.!";
    }

    /** return statement -> will not let execute the code further in that particular func and move ahead. -> sout(return will not let me call) not be executed
     * */

    public static void validateUser(){
        if(_username.equals("gary")){
            System.out.println("welcome admin");
            return;
        }else if(_username.equals("giridhar")){
            System.out.println("welcome user");
            return;
        }
        System.out.println("return will not let me call");
    }
}

class OuterClass{

    public static String url = "www.google.com";

    public static String message(){
        return "i am outer class";
    }
}