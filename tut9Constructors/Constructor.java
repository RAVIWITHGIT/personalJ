/* 
 A member function used to initialize an object while creating it

 constructors can be overload just like other methods in java. 
*/
// package tut9Constructors;

class Employee {
    private String name;
    private int salary;

    // this is Constructors
    public Employee() {
        name = "default";
        salary = 1000;
    }

    // overload constructors
    public Employee(String MyName) {
        name = MyName;
    }

    // overload constructors

    public Employee(String myName, int setSalary) {
        name = myName;
        salary = setSalary;
    }

    public void getInfo() {
        System.out.println(name);
        System.out.println(salary);
    }

}

public class Constructor {
    public static void main(String args[]) {
        Employee newEmployee = new Employee();
        newEmployee.getInfo();

        Employee newEmployee2 = new Employee("ram");
        newEmployee2.getInfo();

        Employee newEmployee3 = new Employee("ravi", 50000);
        newEmployee3.getInfo();

    }
}
