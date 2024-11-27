// package tut9Constructors;

class PracticeClass {
    private int height;
    private int radius;

    public void setHeight(int n) {
        height = n;
    }

    public void setRadius(int n) {
        radius = n;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

}

public class Practice {
    public static void main(String args[]) {
        PracticeClass newCPracticeClass = new PracticeClass();
        newCPracticeClass.setHeight(12);
        newCPracticeClass.setRadius(9);
        System.out.println(newCPracticeClass.getHeight());
        System.out.println(newCPracticeClass.getRadius());
        System.out.println(newCPracticeClass.getVolume());
        System.out.println(newCPracticeClass.surfaceArea());
    }
}
