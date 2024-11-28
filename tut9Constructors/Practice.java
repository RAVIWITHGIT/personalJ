// package tut9Constructors;

// class PracticeClass {
//     private int height;
//     private int radius;

//     public void setHeight(int n) {
//         height = n;
//     }

//     public void setRadius(int n) {
//         radius = n;
//     }

//     public int getHeight() {
//         return height;
//     }

//     public int getRadius() {
//         return radius;
//     }

//     public double getVolume() {
//         return Math.PI * radius * radius * height;
//     }

//     public double surfaceArea() {
//         return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
//     }

// }

// ************* Q3
// class PracticeClass {
//     private int height;
//     private int radius;

//     public PracticeClass(int h, int r) {
//         height = h;
//         radius = r;
//     }

//     public int getHeight() {
//         return height;
//     }

//     public int getRadius() {
//         return radius;
//     }

// }

// *********************** Q4 
// class rectangle {
//     private int height;
//     private int breadth;

//     public rectangle() {
//         this.height = 4;
//         this.breadth = 5;

//     }

//     public rectangle(int h, int b) {
//         this.height = h;
//         this.breadth = b;
//     }

//     public void getInfo() {
//         System.err.println(height);
//         System.err.println(breadth);
//     }
// }

// **************************** Q5
class Sphare {
    private int radius;

    public Sphare(int r) {
        this.radius = r;

    }

    public void getSurfaceArea() {
        double result = 4 * Math.PI * radius * radius;
        System.out.println(result);
    }

    public void getVolume() {
        double result = (Math.PI) * (radius * radius * radius);
        double newResult = 4 / 3d * result;
        System.out.println(newResult);
    }
}

public class Practice {
    public static void main(String args[]) {
        // PracticeClass newCPracticeClass = new PracticeClass();
        // newCPracticeClass.setHeight(12);
        // newCPracticeClass.setRadius(9);
        // System.out.println(newCPracticeClass.getHeight());
        // System.out.println(newCPracticeClass.getRadius());
        // System.out.println(newCPracticeClass.getVolume());
        // System.out.println(newCPracticeClass.surfaceArea());

        // ***************** Q3
        // PracticeClass newPracticeClass = new PracticeClass(12, 9);
        // System.out.println(newPracticeClass.getHeight());
        // System.out.println(newPracticeClass.getRadius());

        // ******************* Q4
        // rectangle newrRectangle = new rectangle();
        // newrRectangle.getInfo();

        // ********************* Q5
        Sphare newsSphare = new Sphare(3);
        // newsSphare.getSurfaceArea();
        newsSphare.getVolume();
    }
}
