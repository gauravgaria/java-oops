package dispatch;

import java.util.Date;

public class DispatchController {

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

        System.out.println(sum(1,2));
        System.out.println(sum(2,3,5));
        System.out.println(OuterClass.message() + OuterClass.url);
    }

    private static String staticMessage(){
        return "I am a static method.!";
    }

}

class OuterClass{

    public static String url = "www.google.com";

    public static String message(){
        return "i am outer class";
    }
}