class Square {
    int side;

    public void Area() {
        System.out.println(side * side);
    }

    public void Perimeter() {
        System.out.println(4 * side);
    }
}

class Rectangle {
    int length;
    int width;

    public void Area() {
        System.out.println(length * width);

    }

    public void Perimeter() {
        System.out.println((length + width) * 2);

    }
}

class circle {
    int radius;

    public void Perimeter() {
        System.out.println((float) 2 * 3.14 * radius);
    }

    public void Area() {
        System.out.println(3.14 * (radius * radius));
    }
}

public class ClassPractice {

    public static void main(String args[]) {
        // Square mySquare = new Square();
        // mySquare.side = 3;
        // mySquare.Area();
        // mySquare.Perimeter();

        // Rectangle newRectangle = new Rectangle();
        // newRectangle.length = 2;
        // newRectangle.width = 3;
        // newRectangle.Area();
        // newRectangle.Perimeter();

        circle newcCircle = new circle();
        newcCircle.radius = 2;
        newcCircle.Perimeter();
        newcCircle.Area();
    }
}