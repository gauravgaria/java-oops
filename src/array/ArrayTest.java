package array;

public class ArrayTest {
    public static void main(String[] args) {
        Array array = new Array();
        array.showNames();

        int sum = array.showSum();
        System.out.println(sum);

        array.showAverage();
    }
}
