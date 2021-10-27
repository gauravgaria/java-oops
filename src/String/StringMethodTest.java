package String;

public class StringMethodTest {
    public static void main(String[] args) {
        StringMethods stringMethods = new StringMethods("Gaurav",28);
        StringMethods stringMethods1 = new StringMethods("Gaurav",28);

        /** Overriding toString() method -> in StringMethods.java
         * 1) remove that override method and check what happens.
         * */
        System.out.println(stringMethods);
        System.out.println(stringMethods1.toString());

        /** Overriding equals() method -> in StringMethod.java
         *  returns false in both case unless equals() is overridden
         * */
        System.out.println(stringMethods == stringMethods1);     //returns false
        System.out.println(stringMethods.equals(stringMethods1));   //returns true when equals() is overridden
    }
}
