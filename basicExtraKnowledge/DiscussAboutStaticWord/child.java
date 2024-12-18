package basicExtraKnowledge.DiscussAboutStaticWord;

public class child {
    public void childMethod() {
        System.out.println("this is child method access by parent class in main method");
    }

    public static void childMethod2() {
        System.out.println("we can access this method without make any object");
    }
}
