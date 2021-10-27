package polymorphism;

public class EmployeeTest {

        /** Polymorphism syntax -> superclass = new child class;
         * */
        public static void main(String[] args) {
            Employee employee = new Employee();
            System.out.println(employee.getDetails());
            employee = new Manager();
            System.out.println(employee.getDetails());
            employee = new Director();
            System.out.println(employee.getDetails());
           // Manager manager = new Employee(); // this is wrong -> child class = new Superclass
        }

}

class Employee{

    private String name="Gaurav";
    private int salary=2000000;

    public String getDetails(){
            return "My name is " + name + " and salary is " + salary;
    }
}

class Manager extends Employee{

    private String dept = "Devops";
    @Override
    public String getDetails() {
        return super.getDetails() + ", I am manager and my department is " + dept;
    }
}

class Director extends Manager{

    private int allowance = 1000000;

    @Override
    public String getDetails() {
        return super.getDetails() + ", I am also Director and i get an allowance of " + allowance;
    }

}
