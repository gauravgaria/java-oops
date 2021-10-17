package array;

public class Array {

    /** Two ways to initialize/instantiate array
     * */
    private String[] _names = new String[2];
    private int[] _userId = {1,2};
    private int[] _numbers = {20,32,14,20,25,15,20,50};

    public void showNames(){

        _names[0] = "gaurav";
        _names[1] = "nimesh";

            for(String name:_names)
            System.out.println(name);

    }

    public int showSum(){
        int sum=0;
        for(int number: _numbers){
            sum += number;                   // same as sum = sum + number
        }
        return sum;
    }

    public void showAverage(){
        float avg = showSum()/_numbers.length;
        System.out.println(String.format("%.2f", avg));
    }

}
