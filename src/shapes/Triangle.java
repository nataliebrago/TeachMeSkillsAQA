package shapes;

public class Triangle extends Shape{

    double sideA;
    double sideB;
    double sideC;

    public Triangle(String shapeName, double sideA, double sideB, double sideC) {
        super(shapeName);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double pp = (sideA + sideB + sideC) / 2.0;  // полупериметр
        return Math.sqrt(pp * (pp - sideA) * (pp - sideB) * (pp - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

}
