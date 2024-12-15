
class MyDeprecated {
    @Deprecated
    void meth() {
        System.out.println("this method is deprecated");
    }
}

public class My9Deprecated {
    public static void main(String args[]) {
        MyDeprecated obj = new MyDeprecated();
        obj.meth();
    }
}
