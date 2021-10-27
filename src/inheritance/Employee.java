package inheritance;

public class Employee {
    public static void main(String[] args) {

    }
    public void getDetails(){
        System.out.println("I am employee");
    }
    public Employee getUser(){
        return new Employee();
    }
}

class Manager extends Employee{
    private int a;
    private static int count = 0;
    public Manager(int a){
        this();         /** use 3: when default constructor is to be called.**/
        this.a = a;     /** use 2: when same name for a local and global vars **/
        // this();     --> NOTE: this() should be the first statement.
    }

    public Manager(){
        System.out.println("I am default constructor --> " + count );
        count++;
    }

    public void showThis(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        /** use 1: refer next three lines how this refers to current instance **/
        System.out.println(manager);
        manager.showThis();
        new Manager().showThis();

        /** use of super() **/
        new Manager().getDetails();
    }


    /*   Method overriding
     *   First -> call parent method(super) and then child
    * */
    @Override
    public void getDetails() {
        super.getDetails();    /** use 1: when want to call vars/etc of super class. **/
        System.out.println("I am manager");
    }

    /** only Exception in overriding -> when return is of type class object
     * */
    @Override
    public Manager getUser() {
        return new Manager();
    }
}
