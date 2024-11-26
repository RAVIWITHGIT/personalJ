/*  ********************************************* Custom class *********************************
if you want make Custom class that not require write public in first , mean whole java file public class only one 
 * 
 * 
*/

//***************  create custom class
class myCustomClass {
    int employeeId;
    String name;
    int age;
    int salary;

    public void getInfo() {
        System.out.printf("Employee Name is %s which have %d employee id \nEmployee Age is %d \n", name, employeeId,
                age);
    }

    public int getSalary() {
        return salary;
    }

}

public class CustomClass {
    public static void main(String args[]) {

        // **************** access custom class
        myCustomClass newClass = new myCustomClass();
        newClass.name = "ravi";
        newClass.employeeId = 1;
        newClass.age = 20;
        newClass.salary = 50000;

        newClass.getInfo();
        int getSalary = newClass.getSalary();
        System.out.println("Salary is " + newClass.salary);
    }
}
