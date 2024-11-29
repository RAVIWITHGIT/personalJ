/*  ************************************************* method overriding ******************************
1.if the child class implements the same method present in the parent class again , it is known as method overriding
2. if you want method overriding make sure access modifiers is be public
3. if first take parameter and second not take parameter , in this case method overriding not work
 
*/

class firstClass {
    int a;

    public void method2() {
        System.out.println("this method2 of firstClass");
    }
}

class secondClass extends firstClass {

    // override keyword indicate that this method override , this is not compulsory
    // but this is good practice
    @Override
    public void method2() {
        System.out.println("this method2 of secondclass");
    }

    public void method3() {
        System.out.println("this method3 of secondclass");
    }
}

public class methodOverriding {
    public static void main(String args[]) {
        secondClass newsSecondClass = new secondClass();
        newsSecondClass.method2();
        newsSecondClass.method3();
    }
}
