//******************************************* dynamic method dispatch *************************

class Phone {
    public void showTime() {
        System.out.println("now is morning");
    }

    public void on() {
        System.out.println("on phone....");
    }
}

class smartPhone extends Phone {
    public void music() {
        System.out.println("play music");
    }

    public void on() {
        System.out.println("on smartPhone....");
    }
}

public class DynamicMethodDispatch {
    public static void main(String args[]) {

        // **************** if refer parent class and object child class this is allowed
        // Phone createPhone = new smartPhone();

        // ******************** if refer child class and object parent class this is not
        // allowed
        // Phone smaPhone = new Phone();

        /*
         * *****************************************************************
         * 1.you can access parent class method in dynamic method dispatch
         * 2. if method are same parent and child then parent method override by child
         * class method
         * 3. we can not access child class method in dynamic method dispatch
         */
        Phone createPhone = new smartPhone();
        createPhone.showTime();
        createPhone.on();

        // ** this is not allowed
        // createPhone.music();

    }
}
