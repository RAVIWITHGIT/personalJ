
/*
1. two type of relationship present in java . first --> Inheritance(Is-A-Relationship) 
second --> Association (Has-A-Relationship)
 * 
 */

class address {
    public String city, state, country;

    address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;

    }
}

class employee {
    public int emp_id;
    public String emp_name;
    address a;

    employee(int emp_id, String emp_name, address a) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.a = a;
    }

    public void show() {
        System.out.println("Employee id is " + emp_id);
        System.out.println("Employee name is " + emp_name);
        System.out.println("Employee city is " + a.city);
        System.out.println("Employee country is " + a.country);
        System.out.println("Employee state is " + a.state);
    }
}

public class Association {
    public static void main(String args[]) {
        address a = new address("jaipur", "rajasthan", "India");

        employee e = new employee(1, "raj", a);
        e.show();
    }

}
