/* ******************************************** access modifiers *********************************
four type access modifiers present in java
1.private
2.default
3. public
4.protected 

here we discuss only private access modifiers

when we use private access modifiers we can not access  properties direct in main  class , we can use method for set and get value of properties
 
 */

class seePrivateAccessModifiers {
    private String name;
    private int age;

    public void setInfo(String setName, int setAge) {
        name = setName;
        age = setAge;
    }

    public void getInfo() {
        System.out.printf("name is %s which age is %d", name, age);
    }
}

class circle {
    private int radius;

    public void setRadius(int r) {
        radius = r;
    }

    public void Perimeter() {
        System.out.println((float) 2 * 3.14 * radius);
    }

    public void Area() {
        System.out.println(3.14 * (radius * radius));
    }
}

public class PrivateAccessModifiers {
    public static void main(String args[]) {
        seePrivateAccessModifiers myClass = new seePrivateAccessModifiers();
        // myClass.name = "ravi";
        // myClass.age = "20;

        myClass.setInfo("ravi", 21);
        // myClass.getInfo();

        circle myCircle = new circle();
        myCircle.setRadius(2);
        myCircle.Area();
    }
}
