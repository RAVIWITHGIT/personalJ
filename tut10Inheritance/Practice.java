class Circle {
    int radius;

    public Circle(int r) {
        this.radius = r;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    int height;

    public Cylinder(int r, int h) {
        super(r);
        this.height = h;
    }

    public double volume() {
        return super.Area() * height;
    }
}

class Rectangle {
    int length, width, height;

    public Rectangle(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public void volume() {
        float result = length * width * height;
        System.out.println(result);
    }

    public void area() {
        float result = width * length;
        System.out.println(result);
    }
}

class cuboid extends Rectangle {

    public cuboid(int l, int w, int h) {
        super(l, w, h);
    }

    public void volume() {
        float result = super.length * super.height * super.width;
        System.out.println(result);
    }

    public void surfaceArea() {
        float result = 2 * super.length * super.width + 2 * super.width * super.height
                + 2 * super.length * super.height;
        System.out.println(result);
    }
}

public class Practice {
    public static void main(String args[]) {
        // Cylinder newCylinder = new Cylinder(4, 5);
        // System.out.println(newCylinder.volume());

        Rectangle newRectangle = new Rectangle(2, 03, 4);
        newRectangle.area();
        newRectangle.volume();
    }
}
