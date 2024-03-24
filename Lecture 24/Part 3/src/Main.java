// inheritance --> sub-class/child class inherits the properties of the base class/parent class

// hybrid inheritance
class Shape {
    public void printArea() {
        System.out.println("area of the shape is: ");
    }
}

// single level inheritance
class Triangle extends Shape {
    public void printArea(int b, int h) {
        System.out.println(0.5*b*h);
    }
}

// multi-level inheritance
class EquilateralTriangle extends Triangle {
    public void printArea(int b, int h) {
        System.out.println(0.5*b*h);
    }
}

// hierarchical inheritance
class Circle extends Shape {
    public void printArea(int r) {
        System.out.println(3.14*r*r);
    }
}

public class Main {
    public static void main(String[] args) {

    }
}