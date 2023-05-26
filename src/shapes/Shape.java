package shapes;

public abstract class Shape {

    private String shapeName; //название фигуры
    private double shapePerimeter; //периметр фигуры
    private double shapeArea; //площадь фигуры

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public double getShapePerimeter() {
        return shapePerimeter;
    }

    public double getShapeArea() {
        return shapeArea;
    }
}
