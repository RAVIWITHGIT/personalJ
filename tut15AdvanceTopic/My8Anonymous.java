/* ******************************************* Anonymous Class ***************************************
1.when you use interface only one time in custom class , then you create custom class in main method in  directly using interface 
2.create class is anonymous class 
3.They enable you to declare and instantiate a class at the same time. They are like local classes except that they do not have a name. Use them if you need to use a local class only once.
 * 
 */

// interface DemoAno {
//     void meth1();

//     void meth2();

// }

// public class My8Anonymous {

//     public static void main(String args[]) {
//         DemoAno obj = new DemoAno() {
//             public void meth1() {
//                 System.out.println("this is meth1");
//             }

//             public void meth2() {
//                 System.out.println("this is meth2");
//             }
//         };
//         obj.meth1();
//     }
// }

/* ****************************************** lambda Expression *****************************************
1. आप लंबडा एक्सप्रेशन का इस्तेमाल कर सकते हो, डायरेक्टली एक ऐसे इंटरफेस को इंप्लीमेंट करने वाली क्लास का ऑब्जेक्ट बनाने के लिए जिसका सिर्फ एक method है
 
 */

@FunctionalInterface
interface DemoAno {
    void meth1(int a);

}

class customClass implements DemoAno {
    public void meth1(int a) {
        System.out.println("this is method 1");
    }
}

public class My8Anonymous {

    public static void main(String args[]) {
        // DemoAno obj = new customClass();
        // obj.meth1();

        // ********************* using lambda expression
        // DemoAno obj = () -> {
        // System.out.println("this method create by lambda expression");
        // };
        // obj.meth1();

        // ****** lambda expression with argument
        DemoAno obj = (a) -> {
            System.out.println("this method create by lambda expression " + a);
        };
        obj.meth1(6);
    }
}
